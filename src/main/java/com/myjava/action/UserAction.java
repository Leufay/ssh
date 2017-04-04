package com.myjava.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class UserAction {
	public String sayHello(){
		System.out.println("Hello world");
		return "list" ;
	}
}

