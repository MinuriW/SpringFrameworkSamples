package com.hcl;

public class HelloBean {
	
	private String name;
	
	public HelloBean() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloBean [name=" + name + "]";
	}
	
	

}
