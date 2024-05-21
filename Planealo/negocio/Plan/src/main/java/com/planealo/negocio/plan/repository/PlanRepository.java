package com.planealo.negocio.plan.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planealo.negocio.plan.model.entity.Plan;
@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
	Optional<Plan> findByReferencia(String referencia);
}
