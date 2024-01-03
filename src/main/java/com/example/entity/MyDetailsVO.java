package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Owner_Details")
public class MyDetailsVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	private String name;
	private String address;
	private String country;
	private String state;
	
	@OneToMany(mappedBy = "vehicle",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<BikeDetailsVO> Bikedetails;
	
	@OneToMany(mappedBy = "vehi",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CarDetailsVO> CarDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<BikeDetailsVO> getBikedetails() {
		return Bikedetails;
	}

	public void setBikedetails(List<BikeDetailsVO> bikedetails) {
		Bikedetails = bikedetails;
	}

	public List<CarDetailsVO> getCarDetails() {
		return CarDetails;
	}

	public void setCarDetails(List<CarDetailsVO> carDetails) {
		CarDetails = carDetails;
	}

	}

	
	
	
	