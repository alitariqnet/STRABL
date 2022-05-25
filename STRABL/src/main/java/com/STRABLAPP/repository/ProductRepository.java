package com.STRABLAPP.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.STRABLAPP.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Optional<Product> findByBrand(String brand);
	Optional<Product> findByColor(String color);
	Optional<Product> findByType(String type);
}
