package com.edubridge.springboot.project.onlineshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.User;

@Service
public interface UserService {
	
	public void addUser(User user);
	
	//public User getUserByemailId(String emailId);

	public List<Products> getAllProducts();

}
