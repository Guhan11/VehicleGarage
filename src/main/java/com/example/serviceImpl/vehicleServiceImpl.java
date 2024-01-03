package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.entity.BikeDetailsVO;
import com.example.entity.CarDetailsVO;
import com.example.entity.MyDetailsVO;
import com.example.repositiory.BikeRepo;
import com.example.repositiory.CarRepo;
import com.example.repositiory.DetailsRepo;
import com.example.service.vehicleService;
@Service
public class vehicleServiceImpl implements vehicleService {

	@Autowired
	DetailsRepo detailsRepo;
	@Autowired
	BikeRepo bikeRepo;
	@Autowired	
	CarRepo carRepo;
	
	//#My Details
	@Override
	public List<MyDetailsVO> getAllDetails() {
		return detailsRepo.findAll();
	}
	@Override
	public MyDetailsVO getDetailsById(int id) {
		return detailsRepo.findById(id).orElse(null);
	}
	@Override
	public MyDetailsVO createDetails(MyDetailsVO detailsVO) {
		return detailsRepo.save(detailsVO);
	}
	@Override
	public ResponseEntity<?> updateDetails(int id, MyDetailsVO detailsVO) {
		MyDetailsVO myDetailsVO = detailsRepo.findById(id).get();
		myDetailsVO.setName(myDetailsVO.getName());
		myDetailsVO.setAddress(myDetailsVO.getName());
		myDetailsVO.setCountry(myDetailsVO.getCountry());
		myDetailsVO.setState(myDetailsVO.getState());
		
		return ResponseEntity.ok().body("Updated Successfully");

	}
	
	// Bike Details
	@Override
	public List<BikeDetailsVO> getAllBike() {
		// TODO Auto-generated method stub
		return bikeRepo.findAll();
	}
	@Override
	public BikeDetailsVO getBikeById(int id) {
		// TODO Auto-generated method stub
		return bikeRepo.findById(id).orElse(null);
	}
	@Override
	public BikeDetailsVO createBike(BikeDetailsVO bikeVO) {
		// TODO Auto-generated method stub
		return bikeRepo.save(bikeVO);
	}
	@Override
	public ResponseEntity<?> updateBike(int id,BikeDetailsVO bikeVO) {
		// TODO Auto-generated method stub
		BikeDetailsVO myBikeVO = bikeRepo.findById(id).get();
		myBikeVO.setName(myBikeVO.getName());
		myBikeVO.setModel(myBikeVO.getModel());
		myBikeVO.setName(myBikeVO.getType());
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
	//Car Details 
	@Override
	public List<CarDetailsVO> getAllCar() {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}
	@Override
	public CarDetailsVO getCarById(int id) {
		// TODO Auto-generated method stub
		return carRepo.findById(id).orElse(null);
	}
	@Override
	public CarDetailsVO createCar(CarDetailsVO carVO) {
		// TODO Auto-generated method stub
		return carRepo.save(carVO);
	}
	@Override
	public ResponseEntity<?> updateCar(int id, CarDetailsVO carVO) {
		// TODO Auto-generated method stub
		CarDetailsVO carDetailsVO = carRepo.findById(id).get();
		carDetailsVO.setName(carDetailsVO.getName());
		carDetailsVO.setModel(carDetailsVO.getModel());
		carDetailsVO.setType(carDetailsVO.getType());
		return ResponseEntity.ok().body("Updated Successfully");
	}
	
}
