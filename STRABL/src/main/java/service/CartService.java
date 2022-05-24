package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Cart;

@Service
public class CartService {

	@Autowired
	Cart cart;
	
	
}
