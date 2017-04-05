package com.myjava.service;

import java.io.Serializable;
import java.util.Collection;

import com.myjava.entity.User;

public interface UserService {
	public void save(User user);
	public void delete(Serializable id) ;
	public void deleteByIds(Serializable[] ids) ;
	public void update(User user) ;
	public User get(Serializable id) ;
	public Collection<User> findAll() ;
	public Collection<User> findByIds(Serializable[] ids) ;
}

