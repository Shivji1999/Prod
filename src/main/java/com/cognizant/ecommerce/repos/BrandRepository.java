package com.cognizant.ecommerce.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ecommerce.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
