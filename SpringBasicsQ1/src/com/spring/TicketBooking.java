package com.spring;

import com.spring.TicketBooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
	
	public double faregenerator() throws NumberFormatException, IOException {
		double disc;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Senior Citizens");
        int seniors = Integer.parseInt(br.readLine());
        
        disc=seniors * fare * (0.3);
        
        System.out.println("Enter the number of Ex Service Men");
        int service = Integer.parseInt(br.readLine());
        disc=service * fare * (0.3);
        
        System.out.println("Enter the number of Infants below 2 years");
        int infants = Integer.parseInt(br.readLine());
        disc=infants * fare * (0.3);
        
        
        return disc;
	}

}
