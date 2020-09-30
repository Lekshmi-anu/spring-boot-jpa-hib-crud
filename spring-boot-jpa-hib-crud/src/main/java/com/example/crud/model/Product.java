package com.example.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Column(name = "PRODUCT_ID")
	private int id;
	
	@Column(name = "PRODUCT_NAME")
	private String name;
	
	@Column(name = "PRODUCT_TYPE")
	private String type;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "PRICE")
	private double price;
	
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
