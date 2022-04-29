package com.springdemos.springcore.test;

public class Customer {
	
	String customername;
	ShoppingCart shoppingcart;

	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", shoppingcart=" + shoppingcart + "]";
	}

	
	

}
