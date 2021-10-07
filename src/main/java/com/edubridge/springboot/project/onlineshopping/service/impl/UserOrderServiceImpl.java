package com.edubridge.springboot.project.onlineshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.UserOrder;
import com.edubridge.springboot.project.onlineshopping.repository.CartRepository;
import com.edubridge.springboot.project.onlineshopping.repository.UserOrderRepository;
import com.edubridge.springboot.project.onlineshopping.service.CartService;
import com.edubridge.springboot.project.onlineshopping.service.UserOrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService {
	
	@Autowired
	UserOrderRepository userOrderRepo;
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
    CartService cartService;

	@Override
	public UserOrder addUserOrder(UserOrder userOrder) {
		return userOrderRepo.save(userOrder);
	}

	@Override
	public List<UserOrder> getAllUserOrders() {
		return userOrderRepo.findAll();
	}

	@Override
	public void deleteProduct(String prodId) {

	}
	
	@Override
	public Cart addProduct(Cart cart) {
		return cartRepo.save(cart);
	}

}
