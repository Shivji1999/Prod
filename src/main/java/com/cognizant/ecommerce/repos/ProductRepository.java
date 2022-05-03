package com.cognizant.ecommerce.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByBrand(String brand);
}
