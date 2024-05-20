 package com.planealo.negocio.customers.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.customers.models.dto.CustomerDTOperfil;
import com.planealo.negocio.customers.models.dto.CustomerDTOresumen;
import com.planealo.negocio.customers.models.entity.Customer;
import com.planealo.negocio.customers.models.mapper.CustomerMapper;
import com.planealo.negocio.customers.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("customer")
public class CustomerController {

	private final CustomerServiceImpl customerService;
	private final CustomerMapper customerMapper;
	
	public CustomerController(CustomerServiceImpl customerService, CustomerMapper customerMapper) {
		super();
		this.customerService = customerService;
		this.customerMapper= customerMapper;
	}

	@GetMapping("all")
	public ResponseEntity<List<CustomerDTOresumen>> findAll(){
		
		return ResponseEntity.ok(this.customerService.getAll()
													.stream()
													.map(customer -> this.customerMapper.toDTOresumen(customer))
													.collect(Collectors.toList()));
	}
	
	@GetMapping("byRef/{ref}")
	public ResponseEntity<?> findByReferencia(@PathVariable String ref){
		
//		this.customerService.
		
		return null;
	}
	
	 @PutMapping("/{ref}")
    public ResponseEntity<CustomerDTOperfil> updateCustomer(@PathVariable String ref, @RequestBody CustomerDTOperfil customerUpdate) {
        Customer customer = customerService.editUser(ref, this.customerMapper.perfilToCustomer(customerUpdate));
        if (customer != null) {
            return ResponseEntity.ok(this.customerMapper.toDTOperfil(customer));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	
}