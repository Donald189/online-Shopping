package com.edubridge.springboot.project.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edubridge.springboot.project.onlineshopping.entities.Products;
import com.edubridge.springboot.project.onlineshopping.service.ProductsService;

@Controller
public class ProductsViewController {
	
	@Autowired
	ProductsService productsService;
	
	@RequestMapping("/")
	public String viewProducts(Model model) {
		List<Products> productsList = productsService.getAllProducts();
		model.addAttribute("productsList", productsList);
		return "index";
	}
	
	/*@RequestMapping("/products")
	public String viewProductss(Model model) {
		List<Products> productsList = productsService.getAllProducts();
		model.addAttribute("productsList", productsList);
		return productsList;
*/
}
