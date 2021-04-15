package com.spring;

import java.util.ArrayList;

public class EventList {

    ArrayList<Event> eventMenu = new ArrayList<>();
	
	public void insert(Event event) {
		eventMenu.add(event);
	}
	public Event search(String key) {
		for(Event e:eventMenu) {
			if(e.getEventName().equals(key)) {
				return e;
			}
			
		}
		return null;
		
		}
	}

