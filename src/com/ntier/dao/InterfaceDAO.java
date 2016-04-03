package com.ntier.dao;

import java.util.Collection;

public interface  InterfaceDAO <T> {
	
	public T add(T entity);

	public int delete(T entity);
	
	public Collection<T> find(T entity) ;

}
