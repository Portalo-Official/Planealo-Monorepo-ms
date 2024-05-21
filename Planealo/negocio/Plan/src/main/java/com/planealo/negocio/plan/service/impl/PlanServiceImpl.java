package com.planealo.negocio.plan.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.repository.PlanRepository;
import com.planealo.negocio.plan.service.IPlanService;

@Service
public class PlanServiceImpl implements IPlanService<Plan, String>{

	private final PlanRepository planRepository;

	public PlanServiceImpl(PlanRepository planRepository) {
		super();
		this.planRepository = planRepository;
	}

	@Override
	public Plan add(Plan entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String ref) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Plan getByRef(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plan> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan update(String ref, Plan entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plan findByReferencia(String ref) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
