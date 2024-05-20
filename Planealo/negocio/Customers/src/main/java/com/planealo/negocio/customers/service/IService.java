package com.planealo.negocio.customers.service;

import java.util.List;

public interface IService<T, Ref> {

	public T add(T t);
	
	public boolean delete(Ref ref);
	
	public T getByRef(Ref ref);
	
	public List<T> getAll();
	
	public boolean addAll(List<T> t);
	
	public T editUser(Ref ref, T t);
	
	
}
