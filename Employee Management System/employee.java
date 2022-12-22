package com.maven.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Setter;
import lombok.Getter;
@Getter 
@Setter
@Entity //It specifies the class is an Entity
@Table(name="Employee_Details") //The table in the database which entity is mapped
public class employee {
	@Id //Marks identifier of the class. It also specifies the primary key of entity
private int empid;
private String empname, empemail, empadd;
private double empsalary;
private long empphone;
}
