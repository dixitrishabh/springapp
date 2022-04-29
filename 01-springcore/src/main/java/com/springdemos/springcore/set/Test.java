package com.springdemos.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/set/config.xml");
		
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println( carDealer);
	}

}


