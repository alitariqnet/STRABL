package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.ProductDAO;
import entity.Product;
import service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
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
}
