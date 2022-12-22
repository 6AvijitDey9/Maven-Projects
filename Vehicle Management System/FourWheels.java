package com.Vehicle.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "vid")
public class FourWheels extends Vehicle {
	private int modelno;
	private String modelname;
	private boolean musicSystem;
	private String etype;
	private boolean ac;
}
