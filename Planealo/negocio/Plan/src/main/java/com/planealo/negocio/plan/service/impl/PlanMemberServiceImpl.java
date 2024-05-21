package com.planealo.negocio.plan.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.entity.PlanMember.PlanMiembroId;
import com.planealo.negocio.plan.repository.PlanMemberRepository;
import com.planealo.negocio.plan.service.IPlanMemberService;

@Service
public class PlanMemberServiceImpl implements IPlanMemberService<PlanMember, PlanMember.PlanMiembroId>{

	private final PlanMemberRepository plaMemberRepo;
	
	public PlanMemberServiceImpl(PlanMemberRepository plaMemberRepo) {
		super();
		this.plaMemberRepo = plaMemberRepo;
	}

	@Override
	public PlanMember add(PlanMember entity) {
		return this.plaMemberRepo.save(entity);
	}

	@Override
	public boolean delete(PlanMiembroId id) {
		Optional<PlanMember> planMemberOpt = this.plaMemberRepo.findById(id);
		if(planMemberOpt.isPresent()) {
			this.plaMemberRepo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public PlanMember getByRef(PlanMiembroId id) {
		return this.plaMemberRepo.findById(id).orElse(null);
	}

	@Override
	public List<PlanMember> getAll() {
		return this.plaMemberRepo.findAll();
	}

	@Override
	public PlanMember update( PlanMember entity) {
		if(this.plaMemberRepo.existsById(entity.getId())) {
			return this.plaMemberRepo.save(entity);
		}
		return null;
	}

	@Override
	public List<PlanMember> getByIdUsuarioRef(PlanMiembroId id) {
		return this.plaMemberRepo.findByIdUsuarioRef(id.getUsuarioRef())
										.orElse(Collections.emptyList());
	}

	

}
