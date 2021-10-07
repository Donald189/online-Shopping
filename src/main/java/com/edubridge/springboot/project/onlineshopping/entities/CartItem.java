/*package com.edubridge.springboot.project.onlineshopping.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_item")
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	
	@ManyToOne
	private Cart Cart;
    
	@ManyToOne
	@JoinColumn(name = "productID")
	private Products products;
	
	public CartItem() {}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Cart getCart() {
		return Cart;
	}

	public void setCart(Cart cart) {
		Cart = cart;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cart, cartId, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		return Objects.equals(Cart, other.Cart) && cartId == other.cartId && Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return "CartItem [cartId=" + cartId + ", Cart=" + Cart + ", products=" + products + "]";
	}

	
}
*/