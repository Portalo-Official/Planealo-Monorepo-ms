package com.planealo.negocio.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planealo.negocio.customers.models.entity.Customer;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Customer findByReferencia(String referencia);
	List<Customer> findByReferenciaContaining(String referencia);
}
