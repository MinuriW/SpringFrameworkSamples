package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp=(Employee)ac.getBean("employee");
		System.out.println(emp);

	}

}
