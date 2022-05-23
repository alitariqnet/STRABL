package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Product> list = new ArrayList<Product>();

	public Cart(List<Product> list) {
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
