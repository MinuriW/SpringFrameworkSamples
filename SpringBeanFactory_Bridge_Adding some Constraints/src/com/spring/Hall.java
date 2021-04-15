package com.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Required;

public class Hall {
	User owner;

	float width;
	float length;
	ArrayList<Event> EventList;
	public User getOwner() {
		return owner;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	public ArrayList<Event> getEventList() {
		return EventList;
	}
	public void setEventList(ArrayList<Event> eventList) {
		
	}
	
	public void displayEventList() {
		Event e = new Event();
		e.display();
	}
	

}
