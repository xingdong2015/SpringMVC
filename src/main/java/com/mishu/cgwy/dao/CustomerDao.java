package com.mishu.cgwy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mishu.cgwy.domain.Customer;

public class CustomerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void register(Customer customer){
		jdbcTemplate.update("insert into customer (name,age)values (?,?)",customer.getFirstName(),customer.getAge());
	}

}
