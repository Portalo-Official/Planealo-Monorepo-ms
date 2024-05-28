package com.planealo.negocio.plan.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.planealo.negocio.plan.model.entity.PlanMember;
import com.planealo.negocio.plan.model.entity.PlanMember.PlanMiembroId;
import com.planealo.negocio.plan.repository.PlanMemberRepository;
import com.planealo.negocio.plan.service.IPlanMemberService;

@Service
public class PlanMemberServiceImpl implements IPlanMemberService<PlanMember, PlanMember.PlanMiembroId, String> {

	private final PlanMemberRepository plaMemberRepo;
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
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
		if (planMemberOpt.isPresent()) {
			this.plaMemberRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public boolean deleteAllByPlan(String referenciaPlan) {
		Optional<List<PlanMember>> planMemberOpt = this.plaMemberRepo.findByIdPlanReferencia(referenciaPlan);
		try {

			planMemberOpt.orElse(Collections.emptyList())
					.forEach(planMember -> this.plaMemberRepo.deleteById(planMember.getId()));
			return true;
		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public PlanMember getByRef(PlanMiembroId id) {
		return this.plaMemberRepo.findById(id).orElse(null);
	}
	@Override
	public List<PlanMember> getByUsuarioRef(String referenciaUsuario) {
		
		final Optional<List<PlanMember>> members = this.plaMemberRepo.findByIdUsuarioRef(referenciaUsuario);
//		members.get().forEach(m ->{
//			this.LOGGER.info(m.toString());
//		});
		return members.orElse(Collections.emptyList());
		
	}
	@Override
	public List<PlanMember> getByPlanRef(String referenciaPlan) {
		
		final Optional<List<PlanMember>> members = this.plaMemberRepo.findByIdPlanReferencia(referenciaPlan);
//		members.get().forEach(m ->{
//			this.LOGGER.info(m.toString());
//		});
		return members.orElse(Collections.emptyList());
		
	}

	@Override
	public List<PlanMember> getAll() {
		return this.plaMemberRepo.findAll();
	}

	@Override
	public PlanMember update(PlanMember entity) {
		if (this.plaMemberRepo.existsById(entity.getId())) {
			return this.plaMemberRepo.save(entity);
		}
		return null;
	}


	@Override
	public Boolean deleteAllByPlanRef(String referenciaPlan) {
		return false;
	}

	

}
