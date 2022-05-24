package com.STRABLAPP.bean;

import org.springframework.stereotype.Component;

//@Component
public class ProductBean {

	private int id;
	private String name;
	private String color;
	private String brand;
	private String type;
	private int price;
	
	public ProductBean(int id, String name, String color, String brand, String type, int price) {
		this.id=id;
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
