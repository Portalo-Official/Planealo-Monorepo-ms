package com.planealo.negocio.customers.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.planealo.negocio.customers.models.entity.Customer;
import com.planealo.negocio.customers.repository.CustomerRepository;
import com.planealo.negocio.customers.service.IService;

@Service
public class CustomerServiceImpl implements IService<Customer, Long> {

	private final CustomerRepository customerRepo;
	
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Override
	public Customer add(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(List<Customer> t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer editUser(Long ref, Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

}
