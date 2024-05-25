package com.planealo.negocio.plan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.plan.utils.ConstTopics;

@RestController
@RequestMapping("/planes")
public class PlanController {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	
	public PlanController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}


	@GetMapping("")
	public ResponseEntity<?> getPlan(){
		
		String mensaje = "Mensajes:: Todos los palnes ";
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
		try {
			this.kafkaTemplate.send(ConstTopics.Topic_Usuario, mensaje);
			
		} catch (Exception e) {
			
			return ResponseEntity.ok("Veamos....".concat(e.getMessage()));
		}
		
		return ResponseEntity.ok("Veamos....");
	}
		
	
}
