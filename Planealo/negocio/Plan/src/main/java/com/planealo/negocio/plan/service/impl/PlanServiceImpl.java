package com.planealo.negocio.plan.service.impl;

import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.repository.PlanRepository;

@Service
public class PlanServiceImpl {

	private final PlanRepository planRepository;

	public PlanServiceImpl(PlanRepository planRepository) {
		super();
		this.planRepository = planRepository;
	}
	
	
	
}
