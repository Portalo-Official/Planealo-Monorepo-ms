package com.planealo.negocio.plan.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.negocio.plan.clients.CustomerClientRest;
import com.planealo.negocio.plan.model.dto.CustomerDTOresumen;
import com.planealo.negocio.plan.model.dto.PlanDTOaux;
import com.planealo.negocio.plan.model.dto.PlanDTOresumen;
import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.mapper.PlanMapper;
import com.planealo.negocio.plan.service.impl.PlanServiceImpl;
import com.planealo.negocio.plan.utils.ConstTopics;

@RestController
@RequestMapping("/planes")
public class PlanController {
	
	private final PlanServiceImpl planService;
	private final CustomerClientRest customerClient;
	private final PlanMapper planMapper;
	
	public PlanController(PlanServiceImpl planService,CustomerClientRest customerClient,PlanMapper planMapper) {
		super();
		this.planService= planService;
		this.customerClient= customerClient;
		this.planMapper= planMapper;
	}


	@GetMapping("all")
	public ResponseEntity<?> getPlan(){
		
		List<PlanDTOresumen> planes = this.planMapper.toDTOresumenList(this.planService.getAll());
			
		return ResponseEntity.ok(planes);
	}
	
	@PostMapping("new")
	public ResponseEntity<?> createPlan(){
		
		List<PlanDTOresumen> planes = this.planMapper.toDTOresumenList(this.planService.getAll());
		
		return ResponseEntity.ok(planes);
	}
	
	@GetMapping("/{referencia}")
	public ResponseEntity<?> getPlanByRef(@PathVariable String referencia){
		
		String mensaje = "Probando, referencia: ".concat(referencia);
		
		Plan plan = this.planService.getByRef(referencia);
		
		if(plan != null) {			
			List<String> usuarioReferencias = plan.getMiembros().stream()
														.map(miembro -> miembro.getId().getUsuarioRef())
														.collect(Collectors.toList());
			
			List<CustomerDTOresumen> miembros = this.customerClient.getUsuariosByReferences(usuarioReferencias);
			return ResponseEntity.ok(PlanDTOaux.toDTO(plan, miembros));
		}
		
		return ResponseEntity.notFound().build();
	}
	
		
	
}
