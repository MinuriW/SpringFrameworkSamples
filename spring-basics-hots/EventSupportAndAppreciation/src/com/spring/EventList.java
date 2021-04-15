package com.spring;

import java.util.ArrayList;

public class EventList {

	ArrayList<Event> eventMenu = new ArrayList<>();

	public void insert(Event event) {
		eventMenu.add(event);
	}

	public Event search(String key) {

		return null;
	}

	public void supportAndAppreciation() {
		if (eventMenu.size() > 0) {
			Event min = eventMenu.get(0);
			Event max = eventMenu.get(0);

			for (int i = 1; i < eventMenu.size(); ++i) {
				Event event = eventMenu.get(i);
				if (event.getFare() < min.getFare()) {
					min = event;
				}
				if (event.getFare() > max.getFare()) {
					max = event;
				}
			}
			Double maxFare = max.getFare() * 0.10;
			Double minFare = min.getFare() * 0.05;

			System.out.format("Provide %.2f to %s organising %s\n", maxFare, max.getEventOrganiser(),
					max.getEventName());
			System.out.format("Provide %.2f to %s organising %s\n", minFare, min.getEventOrganiser(),
					min.getEventName());

		}
	}

}
