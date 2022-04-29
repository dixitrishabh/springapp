package com.springdemos.springcore.test;

import java.util.List;

public class ShoppingCart {

	int id;
	String name;
	double price;
	int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
