package com.planealo.negocio.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.planealo.negocio.customers.models.entity.Customer;

import feign.Param;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	Optional<Customer> findByReferencia(String referencia);
	@Query("SELECT c FROM Customer c WHERE c.email = :email")
	Optional<Customer> findByEmail(@Param("email") String email);
	Optional<List<Customer>> findByReferenciaContaining(String referencia);
}
