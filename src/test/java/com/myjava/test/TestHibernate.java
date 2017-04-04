package com.myjava.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjava.entity.User;

public class TestHibernate {
	@Test
	public void getSessionFactory(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory factory = (SessionFactory) ac.getBean("sessionFactory") ;
		User u = new User();
		u.setId(22L);
		u.setPassword("123123");
		u.setUsername("test");
		Session session = factory.openSession() ;
		Transaction tc = session.beginTransaction() ;
		session.save(u);
		tc.commit();
	}
}

