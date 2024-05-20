package com.planealo.negocio.customers.service.impl;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.planealo.negocio.customers.models.entity.Customer;
import com.planealo.negocio.customers.repository.CustomerRepository;
import com.planealo.negocio.customers.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService<Customer, String> {

	private final CustomerRepository customerRepo;

	public CustomerServiceImpl(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}

	@Override
	public Customer add(Customer t) {
		return this.customerRepo.save(null);
	}

	@Override
	public Boolean delete(Customer customerDelete) {
		Optional<Customer> customer = this.customerRepo.findByReferencia(customerDelete.getReferencia());
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
	public Customer editUser( Customer t) {
		Optional<Customer> existingCustomer = this.customerRepo.findByReferencia(t.getReferencia());
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

}
