package com.example.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bike_Details")
public class BikeDetailsVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	private String name;
	private String model;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	@JsonBackReference
	private MyDetailsVO vehicle;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MyDetailsVO getVehicle() {
		return vehicle;
	}

	public void setVehicle(MyDetailsVO vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
}
