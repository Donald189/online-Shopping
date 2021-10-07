package com.edubridge.springboot.project.onlineshopping.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_order")
public class UserOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userOrderId;
	
	@OneToOne
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name = "userName")
	private User user;
	
	/*@OneToOne
	@JoinColumn(name = "productName")
	private Products products;
	*/
	public UserOrder() {}

	public String getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(String userOrderId) {
		this.userOrderId = userOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cart, user, userOrderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserOrder other = (UserOrder) obj;
		return Objects.equals(cart, other.cart) && Objects.equals(user, other.user)
				&& Objects.equals(userOrderId, other.userOrderId);
	}

	@Override
	public String toString() {
		return "UserOrder [userOrderId=" + userOrderId + ", cart=" + cart + ", user=" + user + "]";
	}

			
	
}
