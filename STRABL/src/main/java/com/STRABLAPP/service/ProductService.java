package com.STRABLAPP.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.STRABLAPP.IService.IProduct;
import com.STRABLAPP.dao.ProductDAO;
import com.STRABLAPP.entity.Product;
import com.STRABLAPP.repository.ProductRepository;

@Service
public class ProductService implements IProduct{

	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductDAO productDAO;
	
	public ProductService() {
		super();
	}

	public ProductService(ProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}

	public List<Product> getAllProducts() {
        return productRepository.findAll();
	}
	
	@Override
	public Optional<Product> getProductById(long id) {
		return productRepository.findById(id);
	}

	@Override
	public Optional<Product> findByBrand(String brand) {
		return productRepository.findByBrand(brand);
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteById(long id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> getAllProductsDesc() {
		return productDAO.getAllProductsDesc();
	}

	@Override
	public List<Product> getAllProducts(int pageNo, int pageSize, String sortBy, String sortDir) {

	        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
	                : Sort.by(sortBy).descending();

	        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

	        Page<Product> products = productRepository.findAll(pageable);

	        List<Product> listOfProducts = products.getContent();

	        return listOfProducts;
	    	}	
}
