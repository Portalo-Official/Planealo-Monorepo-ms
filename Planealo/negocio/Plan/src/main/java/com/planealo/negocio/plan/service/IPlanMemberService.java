package com.planealo.negocio.plan.service;

import java.util.List;

import com.planealo.negocio.plan.model.entity.PlanMember;


public interface IPlanMemberService<T, Ref, Ref2> extends IServiceCRUD<T, Ref> {
	
	List<T> getByPlanRef(Ref2 referenciaPlan);
	List<T> getByUsuarioRef(Ref2 referenciaPlan);
	Boolean deleteAllByPlanRef(Ref2 referenciaPlan);
}
