package com.example.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.BikeDetailsVO;
import com.example.entity.CarDetailsVO;
import com.example.entity.MyDetailsVO;
@Service
public interface vehicleService {

	// My Details
	 List<MyDetailsVO> getAllDetails();	
	MyDetailsVO getDetailsById(int id);
	MyDetailsVO createDetails(MyDetailsVO detailsVO);
	ResponseEntity<?> updateDetails(int id,MyDetailsVO detailsVO);
	
	//Bike Details 
	List<BikeDetailsVO> getAllBike();
	BikeDetailsVO getBikeById(int id);
	BikeDetailsVO createBike(BikeDetailsVO bikeVO);
	ResponseEntity<?> updateBike(int id,BikeDetailsVO bikeVO);
	
	//Car Details
	List<CarDetailsVO> getAllCar();
	CarDetailsVO getCarById(int id);
	CarDetailsVO createCar(CarDetailsVO carsVO);
	ResponseEntity<?> updateCar(int id, CarDetailsVO carsVO);
	
}
