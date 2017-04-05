package com.myjava.service.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myjava.dao.UserDao;
import com.myjava.entity.User;
import com.myjava.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao ;
	@Override
	public void save(User user) {
		
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

}

