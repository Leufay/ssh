package com.myjava.dao.impl;

import org.springframework.stereotype.Repository;

import com.myjava.dao.UserDao;
import com.myjava.entity.User;
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
