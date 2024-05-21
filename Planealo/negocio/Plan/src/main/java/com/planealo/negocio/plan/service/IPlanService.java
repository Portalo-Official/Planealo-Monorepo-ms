package com.planealo.negocio.plan.service;

public interface IPlanService<T, Ref> extends IServiceCRUD<T, Ref>{

	T findByReferencia(Ref ref);
	
}
