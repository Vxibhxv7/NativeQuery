package com.laptop.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Laptops")




public class Laptop {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String brand;
private BigDecimal price;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}

@Override
public String toString() {
	return "Laptop [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}



}
