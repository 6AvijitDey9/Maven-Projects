package com.OneToMany.Entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Table(name="item")
@Entity
public class Items {
@Id
@GeneratedValue(strategy=GenerationType.AUTO) //Id value will be generated automatically in increasing order
private int id;
private String itemname;
private double price;
private int quantity;
}
