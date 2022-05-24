package com.STRABLAPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.STRABLAPP.bean.CartBean;

@Service
public class CartService {

	@Autowired
	CartBean cart;
	
	
}
