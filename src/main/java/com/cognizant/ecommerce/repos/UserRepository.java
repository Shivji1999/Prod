package com.cognizant.ecommerce.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	public User findByEmailAndPassword(String email, String password);
}
