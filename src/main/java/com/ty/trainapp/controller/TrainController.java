package com.ty.trainapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ty.trainapp.dto.Train;
import com.ty.trainapp.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	@RequestMapping("/index")
	public ModelAndView getIndexPage(ModelAndView modelandview) {
		
		modelandview.setViewName("index");
		
		return modelandview;
	}
	
	@RequestMapping("/save-train-form")
	public ModelAndView getSaveTrainFormPage(ModelAndView modelandview) {
		
		modelandview.setViewName("save-train-form");
		
		return modelandview;
	}
	
	
	@RequestMapping(path="/save-train",method=RequestMethod.POST)
	public ModelAndView saveTrain(Train newTrain,Model model,ModelAndView modelAndView) {
		System.out.println(newTrain);
		
		Train savedTrain=trainService.saveTrain(newTrain);
		if(savedTrain!=null) {
			model.addAttribute("msg", "Train saved !!!");
			}
		else {
			model.addAttribute("msg", "Train Not Saved");}
		
		modelAndView.setViewName("display");
		
		return modelAndView;
	}
	@RequestMapping("/search-train-form")
	public ModelAndView getSearchTrainFormPage(ModelAndView modelandview) {
		
		modelandview.setViewName("search-train-form");
		
		return modelandview;
	}
	@RequestMapping("/search-train")
	public ModelAndView searchTrain(@RequestParam("TrainNumber") int trainNumber,ModelAndView modelAndView,Model model) {
		
		System.out.println(trainNumber);
		
		Train searchedTrain= trainService.searchTrain(trainNumber);
		
		if (searchedTrain!=null) {
			model.addAttribute("train", searchedTrain);
			modelAndView.setViewName("display-train-search");
			
		} else {
			model.addAttribute("msg", "train number not found "+trainNumber);
			modelAndView.setViewName("display");
		}
		
		
		return modelAndView;
		
	}
	
	
	
	@RequestMapping("/display-all-train")
	public ModelAndView diplayAllTrain(
	        @RequestParam(name = "page", defaultValue = "1") int page,
	        Model model, ModelAndView modelAndView, Train train) {
	        
	    int pageSize = 10;
	    int offset = (page - 1) * pageSize;

	    List<Train> allTrains = trainService.getAllTrain(offset, pageSize);
	    model.addAttribute("allTrain", allTrains);
	    modelAndView.setViewName("display-all-train");

	    return modelAndView;
	}
	
	
	
	@RequestMapping("/delete-train-form")
	public ModelAndView getDeleteTrainFormPage(ModelAndView modelandview) {
		
		modelandview.setViewName("delete-train-form");
		
		return modelandview;
	}
	@RequestMapping("/deletetrain")
	public ModelAndView deleteTrain(@RequestParam("TrainNumber") int trainNumber,Model model,ModelAndView modelAndView) {
		Train getTrain=trainService.searchTrain(trainNumber);
		Train deletedTrain=	trainService.getDeleteTrain(getTrain);
		if (deletedTrain!=null) {
			model.addAttribute("msg","Train Deleted");
			modelAndView.setViewName("display");
		} else {
			model.addAttribute("msg","Train Not found");
			modelAndView.setViewName("display");
		}
		return modelAndView;
	}
	
	@RequestMapping("/update-train-form")
	public ModelAndView getUpdateTrainFormPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("update-train-form");
		
		return modelAndView;
		
	}
	
	@RequestMapping("/update-train")
	public ModelAndView updateTrain(@RequestParam("TrainNumber") int trainNumber,Model model,ModelAndView modelAndView) {
		
      Train getTrain =trainService.searchTrain(trainNumber);
      
      Train updatedTrain= trainService.getUpdatedTrain(getTrain) ;
      
      if (updatedTrain!=null) {
    	  model.addAttribute("msg", "Updated Train Details");
		
	} else {
		model.addAttribute("msg",  " Train Details will not Updated");

	}
		modelAndView.setViewName("display");
		
		return modelAndView;
		
	}
	
	
	
	
	
	

}
