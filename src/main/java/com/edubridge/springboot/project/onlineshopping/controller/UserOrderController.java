package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.User;
import com.edubridge.springboot.project.onlineshopping.entities.UserOrder;
import com.edubridge.springboot.project.onlineshopping.service.CartService;
import com.edubridge.springboot.project.onlineshopping.service.UserOrderService;

@RestController
public class UserOrderController {
	
	@Autowired
	CartService cartService; 
	
	@Autowired
	UserOrderService userOrderService;
	
	@PostMapping("/cart/add")
	public Cart addProduct(@RequestBody Cart cart) {
		return null ;//cartService.addProduct(cart);
	}
	
	@GetMapping("/cart/orders")
	public List<UserOrder> getAllUserOrders(){
		return userOrderService.getAllUserOrders();
	}
	
	@PostMapping("/user/order")
	public UserOrder addUserOrder(@RequestBody UserOrder userOrder) {
		return userOrderService.addUserOrder(userOrder);
	}
	
	@DeleteMapping("/cart/delete")
	public String deleteProduct(@PathVariable("cartId") String cartId) {
		userOrderService.deleteProduct(cartId);
		return "Deleted Successfully";
	}
	
	/*public String createOrder(@PathVariable("cartId") String cartId) {
		
		UserOrder userOrder = new UserOrder();
		
		Cart cart = cartService.getCartByCartId(cartId);
		//to update cartId for orders  
		userOrder.setCart(cart);
		
		User user = cart.getUser();
		
		userOrder.setUser(user);
		
		userOrderService.addUserOrder(userOrder);
		
		return "redirect:/checkout?cartId = " +cartId;
	}*/

}
