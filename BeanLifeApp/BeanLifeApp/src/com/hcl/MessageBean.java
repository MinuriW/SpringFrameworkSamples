package com.hcl;


public class MessageBean {
	
	private String message;
	
	public MessageBean() {}

	public MessageBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Bean is initialized...");
	}
	
	public void destroy() {
		System.out.println("Bean is destroyed");
	}
	
	

}
