package com.myjava.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.myjava.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T>{
	@Resource
	protected SessionFactory sessionFactory ;
	@Override
	public void insert(T t) {
		this.sessionFactory.getCurrentSession().save(t) ;
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> findByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

