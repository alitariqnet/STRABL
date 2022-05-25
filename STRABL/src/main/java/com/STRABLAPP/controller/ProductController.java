package com.STRABLAPP.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.STRABLAPP.entity.Product;
import com.STRABLAPP.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
    public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    	}
    
    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) {
    	Optional<Product> product = productService.getProductById(id);
        return product;
    	}
    
    @GetMapping("/productsdesc")
    public List<Product> getAllProductsDesc() {
        return productService.getAllProductsDesc();
    	}
    @PostMapping(value="/products")
    public Product addProduct(@Validated @RequestBody Product product) {
        return productService.save(product);
    }     
    
    @GetMapping(value="/productswithpagination")
    public List<Product> getAllProducts(int pageNo, int pageSize, String sortBy, String sortDir) {
        return productService.getAllProducts(pageNo, pageSize, sortBy, sortDir);
    }  
}
