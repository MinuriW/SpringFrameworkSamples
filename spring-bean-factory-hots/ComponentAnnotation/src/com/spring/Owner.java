package com.spring;



import org.springframework.stereotype.Component;

@Component
public class Owner {
	String name;
	String password;
	String mobileNumber;
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDetails(String name,String password,String mobileNumber) {
		setName(name);
		setPassword(password);
		setMobileNumber(mobileNumber);
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Mobile number : " + mobileNumber);
		
	}
	
}

