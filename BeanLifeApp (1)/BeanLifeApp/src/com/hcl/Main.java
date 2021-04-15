package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		MessageBean mBean=(MessageBean)ac.getBean("mBean");
		System.out.println(mBean.getMessage());
		
		TestBean tb=(TestBean)ac.getBean("tBean");
		System.out.println(tb.getName());
		
		UserBean uBean=(UserBean)ac.getBean("uBean");
		System.out.println("Username:"+uBean.getUsername());
		System.out.println("Password:"+uBean.getPassword());
       
		ac.registerShutdownHook(); //shuts down the spring ioc container
	}

}
