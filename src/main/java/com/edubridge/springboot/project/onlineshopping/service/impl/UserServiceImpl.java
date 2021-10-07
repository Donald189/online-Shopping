package com.edubridge.springboot.project.onlineshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.repository.ProductsRepository;
import com.edubridge.springboot.project.onlineshopping.repository.UserRepository;
import com.edubridge.springboot.project.onlineshopping.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ProductsRepository productsRepo;

	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	/*@Override
	public User getUserByemailId(String emailId) {
		return userRepo.getUserByemailId(emailId);
	}*/

	@Override
	public List<Products> getAllProducts() {
		return productsRepo.findAll();
	}

	

}
