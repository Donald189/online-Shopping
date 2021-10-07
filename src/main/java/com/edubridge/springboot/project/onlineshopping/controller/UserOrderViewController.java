package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.springboot.project.onlineshopping.entities.Cart;
import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.entities.UserOrder;
import com.edubridge.springboot.project.onlineshopping.service.ProductsService;
import com.edubridge.springboot.project.onlineshopping.service.UserOrderService;
import com.edubridge.springboot.project.onlineshopping.service.UserService;

@Controller
public class UserOrderViewController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserOrderService userOrderService;
	
	@Autowired
	ProductsService productsService;
	
	/*@RequestMapping("/")
	public String viewProducts(Model model) {
		List<Products> productsList = userService.getAllProducts();
		model.addAttribute("productsList", productsList);
		return "index";
	}
	
	@RequestMapping("/cart")
	public String viewCartPage(Model model) {
		Cart cart = new Cart();
		model.addAttribute(model);
		return "cart_products";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	//@PostMapping("/save")
	public String saveProduct(@ModelAttribute("userOrder") UserOrder userOrder) {
		userOrderService.addUserOrder(userOrder);
		return "redirect:/";
	}*/

}
