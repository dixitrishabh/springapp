package com.springdemos.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springcore/properties/config.xml");
		
		Locations loact = (Locations) context.getBean("locations");
		System.out.println(loact);
	}

}


