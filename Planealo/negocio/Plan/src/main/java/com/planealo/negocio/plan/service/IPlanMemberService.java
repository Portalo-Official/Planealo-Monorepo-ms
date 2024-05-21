package com.planealo.negocio.plan.service;

import java.util.List;


public interface IPlanMemberService<T, Ref> extends IServiceCRUD<T, Ref> {
	
	List<T> getByIdUsuarioRef(Ref usuarioRef);
	
}
