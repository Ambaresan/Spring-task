package com.ty.trainapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_table")
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="train_Number")
	private int trainNumber;
	
	@Column(name="train_Name")
	private String trainName;
	
@Column(name="type")
	private String type;

@Column(name="source_Station")
	private String sourceStation;

@Column(name="depature_Time")
	private String depatureTime;

@Column(name="destination_station")
	private String destinationstation;

@Column(name="arrived_Time")
	private String arrivedTime;

	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}
	public String getDestinationstation() {
		return destinationstation;
	}
	public void setDestinationstation(String destinationstation) {
		this.destinationstation = destinationstation;
	}
	public String getArrivedTime() {
		return arrivedTime;
	}
	public void setArrivedTime(String arrivedTime) {
		this.arrivedTime = arrivedTime;
	}
	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", type=" + type + ", sourceStation="
				+ sourceStation + ", depatureTime=" + depatureTime + ", destinationstation=" + destinationstation
				+ ", arrivedTime=" + arrivedTime + "]";
	}
	
	
	

}
