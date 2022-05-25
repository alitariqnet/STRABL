package com.STRABLAPP.IService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.STRABLAPP.entity.Product;

public interface IProduct {
	List<Product> getAllProducts();
    Optional<Product> getProductById(long id);
    Optional<Product> findByBrand(String brand);
    Product save(Product product);
    void deleteById(long id);
    Map<String, Object> getAllProducts(int pageNo, int pageSize, String sortBy, String sortDir);
}
