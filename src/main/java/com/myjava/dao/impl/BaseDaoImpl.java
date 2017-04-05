package com.myjava.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;

import com.myjava.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T>{
	private Class<T> clazz ;
	private ClassMetadata classMetadata ;
	@Resource
	protected SessionFactory sessionFactory ;
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		ParameterizedType pt =  (ParameterizedType) this.getClass().getGenericSuperclass() ;
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0] ;
		this.classMetadata = this.sessionFactory.getClassMetadata(clazz);
	}
	@Override
	public void insert(T t) {
		this.sessionFactory.getCurrentSession().save(t) ;
	}

	@Override
	public void delete(Serializable id) {
		T obj = this.get(id);
		this.sessionFactory.getCurrentSession().delete(obj);;
	}

	@Override
	public void update(T t) {
		this.sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public T get(Serializable id) {
		return this.sessionFactory.getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from "+clazz.getName()).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findByIds(Serializable[] ids) {
		StringBuilder builder = new StringBuilder("(") ;
		for(int i = 0 ; i<ids.length;i++){
			if(i==ids.length-1){
				builder.append(ids[i]).append(")") ;
			}
			builder.append(ids[i]).append(",") ;
		}
		return this.sessionFactory.getCurrentSession().createQuery("from "+clazz.getName()+" where "+this.classMetadata.getIdentifierPropertyName()+" in "+builder.toString()).list();
	}

}

