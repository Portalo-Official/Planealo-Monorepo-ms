package com.planealo.negocio.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planealo.negocio.customers.models.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
