package com.spring;

import org.springframework.beans.factory.annotation.Required;


public class Hall {

	Owner owner;
	int width,length;
	public Owner getOwner() {
		return owner;
	}
	@Required
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void display() {
		System.out.format("The hall of length %f and width %f is owned by John", length, width);
	}
	
}
