package com.STRABLAPP.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.STRABLAPP.entity.Product;

@Component
public class CartBean {

	List<Product> list = new ArrayList<Product>();

	public CartBean(List<Product> list) {
		this.list = list;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	
	public void addItem(Product p) {
		list.add(p);
	}
	
	public void removeItem(Product p) {
		list.remove(p);
	}
}
