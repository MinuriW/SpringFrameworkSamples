package com.spring;

import java.util.ArrayList;

public class EventList {

	ArrayList<Event> eventMenu = new ArrayList<>();
	
	public void insert(Event event) {
		eventMenu.add(event);
	}
	public ArrayList<String> recommendfor(Double budget){
		ArrayList<String> list = new ArrayList<>();
		int ev = 0;
		for(Event e:eventMenu) {
			ev = (int) (budget/e.getFare());
			if(ev>0) {
				list.add(e.eventName+"-"+ev);
			}
			
		}
		return list;
		
		
	}

}
