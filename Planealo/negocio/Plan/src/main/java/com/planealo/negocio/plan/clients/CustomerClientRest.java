package com.planealo.negocio.plan.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.planealo.negocio.plan.model.dto.CustomerDTOresumen;

@FeignClient(name = "customer.ms", url = "localhost:8099")
public interface CustomerClientRest {
	
	@GetMapping()
	CustomerDTOresumen getUsuariosByReferences();
}
