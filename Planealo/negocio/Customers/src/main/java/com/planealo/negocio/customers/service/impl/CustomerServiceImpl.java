package com.planealo.negocio.customers.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.planealo.negocio.customers.models.entity.Customer;
import com.planealo.negocio.customers.repository.CustomerRepository;
import com.planealo.negocio.customers.service.ICustomerService;
import com.planealo.negocio.customers.utils.Utiles;


@Service
public class CustomerServiceImpl implements ICustomerService<Customer, String> {

	private final CustomerRepository customerRepo;
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Override
	public Customer add(Customer t) {
		t.setReferencia(Utiles.generateReferencia());
		t.setEmail(t.getEmail().toLowerCase());
		return this.customerRepo.save(t);
	}

	@Override
	public Boolean delete(Customer customerDelete, String referencia) {
		Optional<Customer> customer = this.customerRepo.findByReferencia(referencia);
		
		if (customer.isPresent()) {
			if (customer.get().getPassword().equals(customerDelete.getPassword())) { // Puede que se tenga que desencriptar
				this.customerRepo.delete(customer.get());
				return true;
			}
		}
		return false;
	}

	@Override
	public Customer getByRef(String ref) {
		Optional<Customer> customer = this.customerRepo.findByReferencia(ref);
		return customer.orElse(null);
	}

	@Override
	public List<Customer> getAll() {
		return this.customerRepo.findAll();
	}

	@Override
	public Boolean addAll(List<Customer> t) {
		this.customerRepo.saveAll(t);
		return false;
	}

	@Override
	// @Transactional ->
	// https://danielme.com/2023/02/22/curso-spring-data-jpa-transacciones-propagacion-excepciones/
	public Customer editUser( Customer t, String referencia) {
		Optional<Customer> existingCustomer = this.customerRepo.findByReferencia(referencia);
		if (existingCustomer.isPresent()) {
			// Verifica que el correo no exista
			if (this.customerRepo.findByEmail(t.getEmail()).isEmpty()) {
				Customer customer = existingCustomer.get();
				customer.setNombre(t.getNombre());
				customer.setEmail(t.getEmail());
				customer.setPassword(t.getPassword());
				customer.setFechaUltimaActualizacion(LocalDateTime.now());
				return this.customerRepo.save(customer);
			}
		}
		return null;
	}

	@Override
	public List<Customer> getByRefContaing(String ref) {
		Optional<List<Customer>> customers = this.customerRepo.findByReferenciaContaining(ref);
		return customers.orElse(Collections.emptyList());
	}

	@Override
	public List<Customer> getAllByReferencia(List<String> ref) {
		
		List<Customer> customers = ref.stream()
									  .map(r -> this.customerRepo.findByReferencia(r).orElse(null))
									  .filter(customer -> customer != null)
									  .collect(Collectors.toList());
		
		
		return customers;
	}
 
	@Override
	public Customer login(Customer t) {
//		this.LOGGER.info("Antes de Buscar: "+t.toString());
		Optional<Customer> customer = this.customerRepo.findByEmail(t.getEmail().toLowerCase());
//		this.LOGGER.info(customer.toString());
		if(customer.isPresent() && customer.get().getPassword().equals(t.getPassword())) {
			return customer.get();
		}
		
		return null;
	}
	
	
}
