package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.BikeDetailsVO;
import com.example.entity.CarDetailsVO;
import com.example.entity.MyDetailsVO;
import com.example.service.vehicleService;



@RestController
@RequestMapping("/vehicles")
public class DetailsController {

	public static final Logger LOGGER = LoggerFactory.getLogger(DetailsController.class);
	
	@Autowired
	vehicleService vehService;
	
	
// My Details controller	
	@GetMapping("/mydetails")
	public List<MyDetailsVO>  getAllDetails() {
	LOGGER.debug("getAllDetails Service Call Strated...");
	List<MyDetailsVO>  detailsVO = new ArrayList<>();
	try {
		detailsVO = vehService.getAllDetails();
		LOGGER.info("Details information get Succesfully for getAllDetails");
	}catch (Exception e) {
		LOGGER.error("Failed to fetch details for getAllDetails");
	}
	LOGGER.debug("getAllDetails Service Call Ended...");
	return detailsVO;
		
	} 
	
	@GetMapping("/mydetails/{id}")
	public MyDetailsVO getDetailsById(@PathVariable int id) {
		LOGGER.debug("getDetailsById Service Call Strated...");
		MyDetailsVO detailsVO = new MyDetailsVO();
		try {
			detailsVO = vehService.getDetailsById(id);
			LOGGER.info("Details information get Succesfully for getDetailsById",id);
		} catch (Exception e) {
			LOGGER.error("Failed to fetch details for getDetailsById",id);
		}
		LOGGER.debug("getDetailsById Service Call Ended...");
		return detailsVO;
			
	}
	
	@PostMapping("/mydetails")
	public MyDetailsVO createDetails(@RequestBody MyDetailsVO myDetailsVO) {
		LOGGER.debug("createDetails Service Call Strated...");
		MyDetailsVO detailsVO = new MyDetailsVO();
		try {
			detailsVO = vehService.createDetails(myDetailsVO);
			LOGGER.info("Details information get Succesfully for createDetails");
		} catch (Exception e) {
			LOGGER.error("Failed to fetch details for createDetails");
		}
		LOGGER.debug("createDetails Service Call Strated...");
		return detailsVO;
	}
	
	//Bike Details Controller
	
	@GetMapping("/bike")
	public List<BikeDetailsVO>  getAllBike() {
		LOGGER.debug("getAllBike Service Call Strated...");
		List<BikeDetailsVO>  bikeVO = new ArrayList<>();
		try {
			bikeVO = vehService.getAllBike();
			LOGGER.info("BikeDetails information get Succesfully for getAllBike");
		}catch (Exception e) {
			LOGGER.error("Failed to fetch BikeDetails for getAllBike");
		}
		LOGGER.debug("getAllBike Service Call Ended...");
		return bikeVO;
			
		} 

@GetMapping("/bike/{id}")
public BikeDetailsVO getBikeById(@PathVariable int id) {
	LOGGER.debug("getBikeById Service Call Strated...");
	BikeDetailsVO bikeVO = new BikeDetailsVO();
	try {
		bikeVO = vehService.getBikeById(id);
		LOGGER.info("BikeDetails information get Succesfully for getBikeById",id);
	} catch (Exception e) {
		LOGGER.error("Failed to fetch BikeDetails for getBikeById",id);
	}
	LOGGER.debug("getBikeById Service Call Ended...");
	return bikeVO;
		
}

@PostMapping("/bike")
public BikeDetailsVO createBike(@RequestBody BikeDetailsVO mybikeVO) {
	LOGGER.debug("createBike Service Call Strated...");
	BikeDetailsVO bikeVO = new BikeDetailsVO();
	try {
		bikeVO = vehService.createBike(mybikeVO);
		LOGGER.info("BikeDetails information get Succesfully for createBike");
	} catch (Exception e) {
		LOGGER.error("Failed to fetch BikeDetails for createBike");
	}
	LOGGER.debug("createBike Service Call Ended...");
	return bikeVO;
}

//Car Details Controller

@GetMapping("/car")
public List<CarDetailsVO>  getAllCar() {
	LOGGER.debug("getAllCar Service Call Strated...");
	List<CarDetailsVO>  carVO = new ArrayList<>();
	try {
		carVO = vehService.getAllCar();
		LOGGER.info("CarDetails information get Succesfully for getAllBike");
	}catch (Exception e) {
		LOGGER.error("Failed to fetch CarDetails for getAllBike");
	}
	LOGGER.debug("getAllCar Service Call Ended...");
	return carVO;
		
	} 


@GetMapping("/car/{id}")
public CarDetailsVO getCarById(@PathVariable int id) {
	LOGGER.debug("getCarById Service Call Strated...");
	CarDetailsVO carVO = new CarDetailsVO();
	try {
		carVO = vehService.getCarById(id);
		LOGGER.info("CarDetails information get Succesfully for getCarById",id);
	} catch (Exception e) {
		LOGGER.error("Failed to fetch CarDetails  for getCarById",id);
	}
	LOGGER.debug("getCarById Service Call Ended...");
	return carVO;
}

@PostMapping("/car")
public CarDetailsVO createCar(@RequestBody CarDetailsVO mycarVO) {
	LOGGER.debug("createCar Service Call Strated...");
	CarDetailsVO carVO = new CarDetailsVO();
	try {
		carVO = vehService.createCar(mycarVO);
		LOGGER.info("carDetails information get Succesfully for createCar");
	} catch (Exception e) {
		LOGGER.error("Failed to fetch carDetails  for createCar");
	}
	LOGGER.debug("createCar Service Call Ended...");
	return carVO;
}
}