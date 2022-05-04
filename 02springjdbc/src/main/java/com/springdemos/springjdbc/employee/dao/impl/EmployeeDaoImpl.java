package com.springdemos.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springdemos.springjdbc.employee.dao.EmployeeDao;
import com.springdemos.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	//@Override
//	public int create(Employee employee) {
//		String sql = "insert into employee values (?, ?, ?)";
//		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
//		return result;
//	}
	
//	@Override
//	public int update(Employee employee) {
//		String sql = "update employee set firstname= ?, lastname = ? where id = ?";
//		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
//		return result;
//	}
	
	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id = ?";
		int result = jdbcTemplate.update(sql, employee.getId());
		return result;
	}



	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}