package com.spring;

public class TicketBooking {

	int numberOfPersons;
	double fare;

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public double faregenerator() {
		return this.fare * this.numberOfPersons;

	}

}
