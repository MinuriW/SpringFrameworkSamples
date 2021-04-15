package com.hcl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserBean {
	
	private String username;
	private String password;
	
	public UserBean() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String uername) {
		this.username = uername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("UserBean is initialized....");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("UserBean is destroyed...");
	}
	

}
