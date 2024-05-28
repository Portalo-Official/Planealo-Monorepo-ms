package com.planealo.negocio.plan.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.repository.PlanMemberRepository;
import com.planealo.negocio.plan.repository.PlanRepository;
import com.planealo.negocio.plan.service.IPlanService;

import jakarta.transaction.Transactional;

@Service
public class PlanServiceImpl implements IPlanService<Plan, String>{

	private final PlanRepository planRepository;
	private final PlanMemberRepository planMiembroRepo;
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public PlanServiceImpl(PlanRepository planRepository,
						   PlanMemberRepository planMiembroRepo) {
		super();
		this.planRepository = planRepository;
		this.planMiembroRepo= planMiembroRepo;
	}

	@Override
	public Plan add(Plan entity) {
		return this.planRepository.save(entity);
	}

	@Override
	public boolean delete(String ref) {
		Optional<Plan> planMemberOpt = this.planRepository.findByReferencia(ref);
		if(planMemberOpt.isPresent()) {
			this.planRepository.delete(planMemberOpt.get());
			return true;
		}
		return false;
	}

	@Override
	public Plan getByRef(String ref) {
		return this.planRepository.findByReferencia(ref).orElse(null);
	}

	@Override
	public List<Plan> getAll() {
		return this.planRepository.findAll();
	}

	@Override
	public Plan update( Plan entity) {
		Optional<Plan> planOpt = this.planRepository.findByReferencia(entity.getReferencia());
		if(planOpt.isPresent()) {
			Plan plan= planOpt.get();
			plan.setDescripcion(entity.getDescripcion());
			plan.setFechaFin(entity.getFechaFin());
			plan.setModo(entity.getModo());
			plan.setUbicacionLatitud(entity.getUbicacionLatitud());
			plan.setUbicacionAltitud(entity.getUbicacionAltitud());
			return plan;
		}
		return null;
	}

	@Override
	public Plan findByReferencia(String ref) {
		return this.planRepository.findByReferencia(ref).orElse(null);
	}

	@Override
	public Plan deletePlan(String ref) {
		Optional<Plan> planOpt = this.planRepository.findByReferencia(ref);
		if(planOpt.isPresent()) {
			List<PlanMember> miembros = this.planMiembroRepo.findByIdPlanReferencia(ref)
															.orElse(Collections.emptyList());
			this.planMiembroRepo.deleteAll(miembros);
			this.LOGGER.info("Borro miembros");
			this.planRepository.delete(planOpt.get());
			return planOpt.get();
		}
		return null;
	}
	
	
	
}
