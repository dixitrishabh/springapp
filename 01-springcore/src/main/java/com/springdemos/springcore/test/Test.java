package com.springdemos.springcore.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container - box
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/test/config.xml");

		// get the hospital bean from the container
		Customer customer = (Customer) context.getBean("customername");
		
		// print the bean
		System.out.println(customer);
	}

}