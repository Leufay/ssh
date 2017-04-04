package com.myjava.dao;

import java.io.Serializable;
import java.util.Collection;

public interface BaseDao<T> {
	public void insert(T t) ;
	public void delete(Serializable id) ;
	public void update(T t ) ;
	public T get(Serializable id) ;
	public Collection<T> findAll() ;
	public Collection<T> findByIds(Serializable[] ids) ;
}

