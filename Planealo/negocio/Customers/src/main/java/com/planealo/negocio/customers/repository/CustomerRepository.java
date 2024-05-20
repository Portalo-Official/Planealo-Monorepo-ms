package com.planealo.negocio.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planealo.negocio.customers.models.entity.Customer;
import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findByReferencia(String referencia);
	Optional<Customer> findByEmail(String Email);
	Optional<List<Customer>> findByReferenciaContaining(String referencia);
}
