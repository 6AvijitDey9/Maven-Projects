package com.Vehicle.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	
	@Column(length=10)
	private String fuel;
	
	@Column(length=10)
	private String enginePower;
	
	@Column(length=4)
	private int speed;
	
	@Column(length=10)
	private String vtype;
	
	@Column(length=4)
	private int price;
}
