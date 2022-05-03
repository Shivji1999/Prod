package com.cognizant.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ecommerce.model.Brand;
import com.cognizant.ecommerce.repos.BrandRepository;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin("*")
public class BrandController {

	@Autowired
	private BrandRepository repo;

	@GetMapping("/all")
	public List<Brand> getProducts() {
		return repo.findAll();
	}

	@GetMapping("/brand/{id}")
	public Optional<Brand> getProduct(@RequestParam("id") long id) {
		return repo.findById(id);
	}

}
