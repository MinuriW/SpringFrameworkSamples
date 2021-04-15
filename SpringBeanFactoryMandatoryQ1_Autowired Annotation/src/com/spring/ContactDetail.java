package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ContactDetail {
	String mobileNumber;
	String alternateMobileNumber;
	String landlineNumber;
	String email;

	Address address;
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	 
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getLandlineNumber() {
		return landlineNumber;
	}
	 
	public void setLandlineNumber(String landlineNumber) {
		this.landlineNumber = landlineNumber;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}
	@Autowired 
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
	
		System.out.println("Mobile : "+mobileNumber);
		System.out.println("Alternate Mobile : " + alternateMobileNumber);
		System.out.println("Landline : " + landlineNumber);
		System.out.println("email : "+ email);
		
		address.display();

	}
}
