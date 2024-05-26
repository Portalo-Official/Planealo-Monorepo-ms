 package com.planealo.negocio.customers.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("customers")
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
	
	@GetMapping("/{ref}")
	public ResponseEntity<?> findByReferencia(@PathVariable String ref){
		
//		this.customerService.
		
		return null;
	}
	
	 @PutMapping()
    public ResponseEntity<CustomerDTOperfil> updateCustomer( @RequestBody CustomerDTOperfil customerUpdate) {
        Customer customer = customerService.editUser( this.customerMapper.perfilToCustomer(customerUpdate));
        if (customer != null) {
            return ResponseEntity.ok(this.customerMapper.toDTOperfil(customer));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	 @PostMapping("new")
	 public ResponseEntity<?> createCustomer(@RequestBody CustomerDTOperfil customerUpdate) {
		 Customer customer = customerService.add( this.customerMapper.perfilToCustomer(customerUpdate));
		 if (customer != null) {
			 return ResponseEntity.ok()
					 .header("New Customer", HttpHeaders.ACCEPT)
					 .body(this.customerMapper.toDTOperfil(customer));
		 } else {
			 return ResponseEntity.badRequest()
					 .body("Campos invalidados"); //TODO Hardcodeo
		 }
	 }
	 
	 @DeleteMapping()
	 public ResponseEntity<?> delete(@RequestBody CustomerDTOperfil customerDelete){
		 Boolean isDelete = customerService.delete( this.customerMapper.perfilToCustomer(customerDelete));
        if (isDelete) {
            return ResponseEntity.ok(customerDelete);
        } else {
            return ResponseEntity.badRequest()
            		.header("Delete Customer", HttpHeaders.WARNING)
            		.body("Problemas al borrar el usuario");
        }
	 }
	
	 @GetMapping("by-list")
	 public ResponseEntity<List<CustomerDTOresumen>> getCustomersByList(@RequestBody List<String> referencias){
		 
		 final List<Customer> customers = this.customerService.getAllByReferencia(referencias);
		 if(!customers.isEmpty()) {
			 
			 List<CustomerDTOresumen> customerDTOresumens = customers.stream()
					 										.map(customer -> this.customerMapper.toDTOresumen(customer))
					 										.collect(Collectors.toList());
			return ResponseEntity.ok(customerDTOresumens); 
		 }
		 
		 return ResponseEntity.notFound().build();
	 }
	
}
