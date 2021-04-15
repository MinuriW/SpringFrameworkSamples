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
		this.EventList = eventList;
	}

	public void display() {
		//1.)Inaugration
		//2.)National Anthem
		
		if(EventList != null) {
			for(int i = 0; i < EventList.size(); ++i) {
				System.out.println((i + 1)+ ".)" + EventList.get(i).name);
			}
		}
	}

}
