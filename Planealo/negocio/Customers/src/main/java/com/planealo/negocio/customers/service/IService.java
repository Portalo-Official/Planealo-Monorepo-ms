package com.planealo.negocio.customers.service;

import java.util.List;

public interface IService<T, Ref> {

	public T add(T t);
	
	public Boolean delete(T t);
	
	public T getByRef(Ref ref);
	
	public List<T> getAll();
	
	public Boolean addAll(List<T> t);
	
	public T editUser( T t);
	
	
}
