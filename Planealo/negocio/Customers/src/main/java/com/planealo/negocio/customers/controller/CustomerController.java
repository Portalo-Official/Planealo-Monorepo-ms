package com.planealo.negocio.customers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.customers.service.IService;
import com.planealo.negocio.customers.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("customer")
public class CustomerController {

	private final CustomerServiceImpl customerService;

	public CustomerController(CustomerServiceImpl customerService) {
		super();
		this.customerService = customerService;
	}


	
	
}
