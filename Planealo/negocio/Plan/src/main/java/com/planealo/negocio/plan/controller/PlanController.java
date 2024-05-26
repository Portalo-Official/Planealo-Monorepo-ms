package com.planealo.negocio.plan.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.plan.clients.CustomerClientRest;
import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.service.impl.PlanServiceImpl;
import com.planealo.negocio.plan.utils.ConstTopics;

@RestController
@RequestMapping("/planes")
public class PlanController {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	private final PlanServiceImpl planService;
	private final CustomerClientRest customerClient;
	
	public PlanController(PlanServiceImpl planService,CustomerClientRest customerClient, KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.planService= planService;
		this.customerClient= customerClient;
		this.kafkaTemplate = kafkaTemplate;
	}


	@GetMapping("")
	public ResponseEntity<?> getPlan(){
		
		String mensaje = "Mensajes:: Todos los planes ";
		try {
			this.kafkaTemplate.send(ConstTopics.Topic_Usuario, mensaje);
			
		} catch (Exception e) {
			
			return ResponseEntity.ok("Veamos....".concat(e.getMessage()));
		}
		
		return ResponseEntity.ok("Veamos....");
	}
	
	@GetMapping("/{referencia}")
	public ResponseEntity<?> getPlanByRef(@PathVariable String referencia){
		
		String mensaje = "Probando, referencia: ".concat(referencia);
		
		Plan plan = this.planService.getByRef(referencia);
//		this.customerClient.getUsuariosByReferences(null);
		
		if(plan != null) {			
			return ResponseEntity.ok(plan);
		}
		
		return ResponseEntity.notFound().build();
	}
	
		
	
}
