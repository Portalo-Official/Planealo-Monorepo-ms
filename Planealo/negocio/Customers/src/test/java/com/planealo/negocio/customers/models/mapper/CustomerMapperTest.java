package com.planealo.negocio.customers.models.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.planealo.negocio.customers.models.dto.CustomerDTOperfil;
import com.planealo.negocio.customers.models.entity.Customer;

@SpringBootTest
@ActiveProfiles("test")
class CustomerMapperTest {
	@Autowired
	CustomerMapper customerMaper;
	
	@Test
	void entitytoDTO() {
		
		Customer customer = Customer.builder().id(1L).email("sample@gmail.com").nombre("peter").referencia("#1231-0F").build();
		
		CustomerDTOperfil customerDTO =  this.customerMaper.toDTOperfil(customer);
		
		assertNotNull(customerDTO);
		
		assertEquals(customer.getNombre(), customerDTO.nombre());
		assertEquals(customer.getEmail(), customerDTO.email());
		assertEquals(customer.getReferencia(), customerDTO.ref());
		assertNull(customerDTO.pass());
	}
	
	@Test
	void DTOtoEntity() {
		
		 CustomerDTOperfil customerDTO = new CustomerDTOperfil(
		            "ref123",         // ref
		            "Juan Perez",     // nombre
		            "juan.perez@example.com", // email
		            "password123"     // pass
		        );
		
		Customer customer= this.customerMaper.perfilToCustomer(customerDTO);
		
		assertEquals( customerDTO.nombre(), customer.getNombre());
		assertEquals( customerDTO.email(), customer.getEmail());
		assertEquals( customerDTO.ref(), customer.getReferencia());
		assertEquals(customer.getPassword(), customerDTO.pass());
		assertNotNull(customer.getFechaCreacion());
		assertNotNull(customer.getFechaUltimaActualizacion());
		assertNotNull(customer.getUltimoInicioSesion());	
	}
	
	
}
