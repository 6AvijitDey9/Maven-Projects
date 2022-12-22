package com.Vehicle.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "vid")
public class TwoWheels extends Vehicle {
	private int modelno;
	private String modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
}
