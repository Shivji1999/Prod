package com.cognizant.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ecommerce.model.Product;
import com.cognizant.ecommerce.repos.ProductRepository;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/all")
	public List<Product> getProducts(){
		return repo.findAll();
	}
	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable("id") String id) {
		return repo.findById(Long.parseLong(id));
	}
	
	@GetMapping("/{brand}")
	public List<Product> getProductByBrand(@PathVariable("brand") String brand){
		return repo.findByBrand(brand);
	}
}
