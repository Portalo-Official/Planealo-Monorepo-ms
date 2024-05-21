package com.planealo.negocio.plan.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planealo.negocio.plan.model.entity.PlanMember;

public interface PlanMemberRepository extends JpaRepository<PlanMember, PlanMember.PlanMiembroId> {
	/*
	 * List<PlanMember>  findByUsuarioRef(String usuarioRef); seria lo normal
	 * como es un id compuesto hay que hacer id.usuarioRed de tal forma -> findByIdUsuarioRef
	 */
    Optional<List<PlanMember>> findByIdUsuarioRef(String usuarioRef);
    
    
}