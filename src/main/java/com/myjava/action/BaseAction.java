package com.myjava.action;

import java.lang.reflect.ParameterizedType;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	public static final String LIST = "list" ;
	public static final String TO_LIST = "toList" ;
	public static final String TO_ADD = "addUI" ;
	public static final String ADD = "add" ;
	public static final String TO_UPDATE = "toUpdate";
	public static final String UPDATE = "updateUI";
	private Class<T> clazz ;
	private T t ;
	@SuppressWarnings("unchecked")
	public BaseAction(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass() ;
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0] ;
		try {
			t = this.clazz.newInstance() ;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	@Override
	public T getModel() {
		return t;
	}

}
