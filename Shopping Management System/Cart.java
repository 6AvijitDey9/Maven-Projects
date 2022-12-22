package com.OneToMany.Entity;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Table;

@Table(name="cart")
@Entity
public class Cart {
@Id
@GeneratedValue
private int cart_id;
private String name;
@OneToMany(cascade=CascadeType.ALL) //When we perform some action on the target entity
//The same action will be applied to the associated entity
@JoinColumn(name="cid")
private List<Items> item;

public int getCart_id() {
	return cart_id;
}
public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Items> getItem() {
	return item;
}
public void setItem(List<Items> item) {
	this.item = item;
}
}
