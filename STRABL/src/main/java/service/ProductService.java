package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Product;
import repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
        return productRepository.findAll();
	}

	public Optional<Product> getProductById(long id) {
		return productRepository.findById(id);
	}
}
