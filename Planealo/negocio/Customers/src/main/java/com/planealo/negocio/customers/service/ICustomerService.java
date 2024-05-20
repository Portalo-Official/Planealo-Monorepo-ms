package com.planealo.negocio.customers.service;

import java.util.List;

public interface ICustomerService<T, Ref> extends IService<T, Ref>{
	/**
	 * Metodo que retorna los elementos que tengan contenido el
	 * patron del parametro ref en su campo de referencia.
	 * @param ref fragmento de referencia
	 * @return List<T>
	 */
	public List<T> getByRefContaing(Ref ref);

	
	
}
