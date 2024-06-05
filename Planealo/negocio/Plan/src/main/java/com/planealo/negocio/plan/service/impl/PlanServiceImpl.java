package com.planealo.negocio.plan.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.model.entity.Plan;
import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.entity.Rol;
import com.planealo.negocio.plan.repository.PlanMemberRepository;
import com.planealo.negocio.plan.repository.PlanRepository;
import com.planealo.negocio.plan.repository.RolRepository;
import com.planealo.negocio.plan.service.IPlanService;


@Service
public class PlanServiceImpl implements IPlanService<Plan, String>{

	private final PlanRepository planRepository;
	private final PlanMemberRepository planMiembroRepo;
	private final RolRepository rolRepo;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public PlanServiceImpl(PlanRepository planRepository,
						   PlanMemberRepository planMiembroRepo,
						   RolRepository rolRepo) {
		super();
		this.planRepository = planRepository;
		this.planMiembroRepo= planMiembroRepo;
		this.rolRepo = rolRepo;
	}
	
	public Plan createPlan(Plan plan) {
		return this.planRepository.save(plan);
	}
	
	@Override
	public Plan add(Plan entity) {
		
		
		if(entity.getMiembros()!= null && entity.getMiembros().size()==1) {
			
			PlanMember miembroPropietario = entity.getMiembros().get(0);
			// No puede tneer referencias aun
			miembroPropietario.getId().setPlanReferencia(null);
			
			if(miembroPropietario != null) {
				if (miembroPropietario.getRol().getNombre().equals(Rol.RolNombre.PROPIETARIO)) {
					List<PlanMember> miembros = new ArrayList<>();
					entity.setMiembros(miembros);
					Plan plan = this.planRepository.save(entity);
					
					if(plan!=null) {
						miembroPropietario.getId().setPlanReferencia(plan.getReferencia());
						addMiembroOwner(miembroPropietario);
						return this.planRepository.findByReferencia(plan.getReferencia()).orElse(null);
					}
				}
			}
		}
		return null;
	}
	
	private PlanMember addMiembroOwner(PlanMember entity) {
		
			List<Rol> roles = this.rolRepo.findAll();
			for (Rol rol : roles) {
				if (rol.getNombre().equals(entity.getRol().getNombre())) {
					entity.setRol(rol);
					return this.planMiembroRepo.save(entity);
				}
			}
		
		return null;
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

	@Override
	public List<Plan> getAllByRef(List<String> refs) {		
		return this.planRepository.findAllByReferencia(refs);
	}
	
	
	
}
