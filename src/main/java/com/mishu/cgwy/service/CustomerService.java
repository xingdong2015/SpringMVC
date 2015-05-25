package com.mishu.cgwy.service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.mishu.cgwy.dao.CustomerRepository;
import com.mishu.cgwy.domain.Customer;
import com.mishu.cgwy.jdo.CustomerQueryRequest;

public class CustomerService {
	@Autowired
	private CustomerRepository customerRespository;
	public Page<Customer> findAll(CustomerQueryRequest request){
        final PageRequest pageable = new PageRequest(request.getPage(), request.getPageSize(), new Sort(Sort
                .Direction.DESC, "id"));
		return customerRespository.findAll(new Specification<Customer>() {
			
			@Override
			public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query,
					CriteriaBuilder cb) {
				return null;
			}
		},pageable);
	}
}
