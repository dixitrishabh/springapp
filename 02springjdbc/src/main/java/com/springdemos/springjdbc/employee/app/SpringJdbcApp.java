package com.springdemos.springjdbc.employee.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springdemos.springjdbc.employee.dao.EmployeeDao;
import com.springdemos.springjdbc.employee.dto.Employee;

public class SpringJdbcApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springdemos/springjdbc/employee/config/config.xml");
		EmployeeDao employeedao = (EmployeeDao) context.getBean("employeedao");
		
		createEmployee(employeedao);
//		createEmployee(employeedao);
//		delteEmployee(employeedao);
		
//		readEmployee(employeedao);
		
		readEmployees(employeedao);
		
	}
	
//	private static void updateEmployee(EmployeeDao employeedao) {
//		Employee emp = new Employee();
//		emp.setId(2);
//		emp.setFirstName("Max");
//		emp.setLastName("White");
//		int result = employeedao.update(emp);
//		System.out.println("Number of records update are: " + result);
//		
//		
//	}
	
//	private static void delteEmployee(EmployeeDao employeedao) {
//		Employee emp = new Employee();
//		emp.setId(2);
//		int result = employeedao.delete(emp);
//		System.out.println("Number of records delete are: " + result);
//		
//		
//	}

	private static void createEmployee(EmployeeDao employeedao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Max");
		emp.setLastName("White");
		int result = employeedao.create(emp);
		System.out.println("Number of records inserted are: " + result);
		
		
	}
	
	
	private static void readEmployees(EmployeeDao employeedao) {
		List<Employee> emps = employeedao.read();
		System.out.println(emps);		
	}

	private static void readEmployee(EmployeeDao employeedao) {
		Employee emp = employeedao.read(3);
		System.out.println(emp);
	}
	
}