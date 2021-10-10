package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.exception.InvalidInputException;
import com.edubridge.springboot.project.onlineshopping.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user/add")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("user/users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id){
		if(id <= 0) {
			throw new InvalidInputException(id+" is not a valid User ID");
		}
		User user = userService.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id+" is not a valid User ID");
		}
		userService.deleteUser(id);
		return "Deleted successfully";
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") int userId,
			@RequestBody User user){
		if(userId <= 0) {
			throw new InvalidInputException(userId+" is not a valid User ID");
		}
		User updateUser = userService.updateUser(userId, user);
		return ResponseEntity.ok(updateUser);
	}

}
