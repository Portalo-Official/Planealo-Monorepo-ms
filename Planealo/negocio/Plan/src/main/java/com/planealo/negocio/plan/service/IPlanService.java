package com.planealo.negocio.plan.service;

import java.util.List;

public interface IPlanService<T, Ref> extends IServiceCRUD<T, Ref>{

	T findByReferencia(Ref ref);
	List<T> getAllByRef (List<Ref> refs);
	T deletePlan(Ref ref);
	
}
