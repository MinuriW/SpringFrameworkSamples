package com.hcl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements InitializingBean,DisposableBean
{
	
	
	private String name;

	public TestBean() {}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("TestBean initialized.....");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("TestBean destroyed.....");
		
	}

	

}
