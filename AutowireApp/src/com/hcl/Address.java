package com.hcl;

public class Address {
	
	private int addId;
	private String city;
	private String zip;
	
	public Address() {}

	public Address(int addId, String city, String zip) {
		super();
		this.addId = addId;
		this.city = city;
		this.zip = zip;
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return addId+"\t"+city+"\t"+zip;
	}
	
	

}
