 package com.planealo.negocio.customers.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.customers.models.dto.CustomerDTOlogin;
import com.planealo.negocio.customers.models.dto.CustomerDTOperfil;
import com.planealo.negocio.customers.models.dto.CustomerDTOresumen;
import com.planealo.negocio.customers.models.entity.Customer;
import com.planealo.negocio.customers.models.mapper.CustomerMapper;
import com.planealo.negocio.customers.service.impl.CustomerServiceImpl;
import com.planealo.negocio.customers.utils.ConstTopics;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("customers")
public class CustomerController {

	private final CustomerServiceImpl customerService;
	private final CustomerMapper customerMapper;
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	public CustomerController(CustomerServiceImpl customerService, CustomerMapper customerMapper, KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.customerService = customerService;
		this.customerMapper= customerMapper;
		this.kafkaTemplate= kafkaTemplate;
	}

	@GetMapping("all")
	public ResponseEntity<List<CustomerDTOresumen>> findAll(){
		
		return ResponseEntity.ok(this.customerService.getAll()
													.stream()
													.map(customer -> this.customerMapper.toDTOresumen(customer))
													.collect(Collectors.toList()));
	}
	
	@GetMapping("/{referencia}")
	public ResponseEntity<?> findByReferencia(@PathVariable String referencia){
		
//		this.customerService.
		CustomerDTOperfil customer = this.customerMapper.toDTOperfil( this.customerService.getByRef(referencia));
		return ResponseEntity.ok(customer);
	}
	
	 @PutMapping("update/{referencia}")
    public ResponseEntity<CustomerDTOperfil> updateCustomer(@PathVariable String referencia, @RequestBody CustomerDTOperfil customerUpdate) {
        Customer customer = customerService.editUser( this.customerMapper.perfilToCustomer(customerUpdate), referencia);
        if (customer != null) {
            return ResponseEntity.ok(this.customerMapper.toDTOperfil(customer));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	 @PostMapping("new")
	 public ResponseEntity<?> createCustomer(@RequestBody CustomerDTOperfil customerUpdate) {
		if(customerUpdate!=null) {
			 Customer customer = this.customerService.add( this.customerMapper.perfilToCustomer(customerUpdate));
			 if (customer != null) {
				 return ResponseEntity.ok()
						 .header("New Customer", HttpHeaders.ACCEPT)
						 .body(this.customerMapper.toDTOperfil(customer));
			 } else {
				 return ResponseEntity.badRequest()
						 .body("Campos invalidados"); //TODO Hardcodeo
			 }
		}
		 return ResponseEntity.badRequest()
				 .body("Body Request null"); //TODO Hardcodeo
	 }
	 
	 @PostMapping("login")
	 public ResponseEntity<?> login(@RequestBody CustomerDTOlogin customerLogin) {
		 
		Customer customer = this.customerService.login(this.customerMapper.loginToCustomer(customerLogin));
		if (customer!= null) {
			return ResponseEntity.ok(this.customerMapper.toDTOperfil(customer));
		}
		 
	 	return ResponseEntity.notFound().build();
	 }
	 
	 
	 @DeleteMapping("/delete/{referencia}")
	 public ResponseEntity<?> delete(@PathVariable String referencia, @RequestBody CustomerDTOperfil customerDelete){
		 Boolean isDelete = customerService.delete( this.customerMapper.perfilToCustomer(customerDelete), referencia);
        if (isDelete) {
        	
        	this.kafkaTemplate.send(ConstTopics.Topic_Borrar_Usuario, referencia );
        	
            return ResponseEntity.ok(customerDelete);
        } else {
            return ResponseEntity.badRequest()
            		.header("Delete Customer", HttpHeaders.WARNING)
            		.body("Problemas al borrar el usuario");
        }
	 }
	
	 @PostMapping("by-list")
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
