package com.edubridge.springboot.project.onlineshopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.UserOrder;

@Service
public interface UserOrderService {
	
	public UserOrder addUserOrder(UserOrder userOrder);

	public List<UserOrder> getAllUserOrders();

	public void deleteProduct(String cartId);

	public Cart addProduct(Cart Cart);

}
