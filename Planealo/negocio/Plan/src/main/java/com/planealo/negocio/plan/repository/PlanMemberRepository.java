package com.planealo.negocio.plan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planealo.negocio.plan.model.entity.PlanMember;

public interface PlanMemberRepository extends JpaRepository<PlanMember, PlanMember.PlanMiembroId>{
	List<PlanMember>  findByUsuarioRef(String usuarioRef);
	
}
