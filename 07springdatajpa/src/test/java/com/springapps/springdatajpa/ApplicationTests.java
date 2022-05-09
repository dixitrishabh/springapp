package com.springapps.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springapps.springdatajpa.entity.Product;
import com.springapps.springdatajpa.repos.ProductRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		
		Product product = new Product(1, "x", "xyz", 78);
		repo.save(product);

	}
}
