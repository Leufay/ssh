package com.myjava.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.myjava.entity.User;
import com.myjava.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User>{
	@Resource
	private UserService userService ;
	public String sayHello(){
		System.out.println("Hello world");
		return LIST ;
	}
}