package com.javadev.MultiThreading;

public class TicketCounter {
	
	private int availableSeats = 3;
	
	public synchronized  void bookTicket(String pname, int numberOfSeats) {
		
		// logic going on here
		
		if((availableSeats > numberOfSeats) && (numberOfSeats > 0)) {
			
			System.out.println("Hello: "+pname+" "+numberOfSeats+ " seat available");
			
			availableSeats = availableSeats - numberOfSeats;
			
		}else {
			System.out.println(pname+", for u No seats available");
		}
		
	}

}

