package com.planealo.negocio.plan.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.planealo.negocio.plan.model.dto.CustomerDTOresumen;

@FeignClient(name = "customer-ms", url = "localhost:4001")
public interface CustomerClientRest {
	
	@PostMapping("/customers/by-list")
	List<CustomerDTOresumen> getUsuariosByReferences(@RequestBody List<String> referencias);
	
	
	
}
