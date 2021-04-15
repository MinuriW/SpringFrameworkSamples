package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args)
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(BeanConfig.class);
		MessageBean mb=(MessageBean)ac.getBean("messageBean");

		System.out.println(mb.getMessage());
		
		HelloBean hb=(HelloBean)ac.getBean("hello");
		System.out.println(hb.getName());
	}

}
