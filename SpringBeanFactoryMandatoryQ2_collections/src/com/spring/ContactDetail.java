package com.spring;


import java.util.ArrayList;

public class ContactDetail {
    ArrayList<String> contactNumbers;
	
	String email;
	
	Address address;
	
	public ArrayList<String> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(ArrayList<String> contactNumbers) {
		this.contactNumbers = contactNumbers;
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
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		
		System.out.println("The contact numbers are ");
		System.out.println(contactNumbers);
		System.out.println("email : " + email);
		//Address address = new Address();
		address.display();

	}
}
