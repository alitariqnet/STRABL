package com.STRABLAPP.bean;

import org.springframework.stereotype.Component;

//@Component
public class CustomerBean {

	private int Id;
	private String name;
	private String phone;
	private String address;
	
	public CustomerBean(int id, String name, String phone, String address) {
		this.Id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
