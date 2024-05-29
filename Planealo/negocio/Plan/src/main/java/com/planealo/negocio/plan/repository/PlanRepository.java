package com.planealo.negocio.plan.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.planealo.negocio.plan.model.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
	Optional<Plan> findByReferencia(String referencia);// No se porque coño no Funca
	
	@Query("SELECT p FROM Plan p WHERE p.referencia = :referencia")
    Optional<Plan> getByReferencia(@Param("referencia") String referencia);
	

	@Query("SELECT p FROM Plan p WHERE p.referencia IN :referencias")
    List<Plan> findAllByReferencia(@Param("referencias") List<String> referencias);
	
}
