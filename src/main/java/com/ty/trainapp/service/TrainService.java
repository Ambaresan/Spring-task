package com.ty.trainapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.trainapp.dao.TrainDao;
import com.ty.trainapp.dto.Train;
@Service
public class TrainService {
	
	@Autowired
	private TrainDao trainDao;
	public Train saveTrain(Train train) {
		
		return trainDao.saveTrain(train);
		
	}
	public Train searchTrain(int trainNumber) {
		
		return trainDao.searchTrain(trainNumber);
	}
	
	



	public List<Train> getAllTrain(int page, int pageSize ) {
		return trainDao.getAllTrain(page, pageSize);
	}
	
	
	public Train getDeleteTrain(Train getTrain) {
		
		return trainDao.deleteTrain(getTrain);
	}
	
	public Train getUpdatedTrain(Train getTrain) {
		
		return trainDao.getUpdateTrain(getTrain);
	}
	
	
	

}
