package com.mishu.cgwy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mishu.cgwy.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>,JpaSpecificationExecutor<Customer>{
	
	
}