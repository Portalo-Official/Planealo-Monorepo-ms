package com.planealo.negocio.plan.service;

import java.util.List;

public interface IServiceCRUD<T, Ref> {

	T add(T entity);

	boolean delete(Ref ref);

	T getByRef(Ref ref);

	List<T> getAll();

	T update( T entity);

}
