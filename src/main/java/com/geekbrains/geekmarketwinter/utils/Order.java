package com.geekbrains.geekmarketwinter.utils;

import com.geekbrains.geekmarketwinter.entities.OrderItem;
import com.geekbrains.geekmarketwinter.entities.User;
//import lombok.Data;

import java.util.List;

//@Data
public class Order {

	private User user;
	private List<OrderItem> orderItems;
	private double price;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order(User user, List<OrderItem> orderItems, double price) {
		this.user = user;
		this.orderItems = orderItems;
		this.price = price;
	}

	public Order() {
	}
}
