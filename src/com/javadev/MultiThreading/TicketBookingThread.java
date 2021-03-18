package com.javadev.MultiThreading;

public class TicketBookingThread implements Runnable {
	
	// implement runnable 
	
	private TicketCounter counter;
	private String passangerName;
	private int numberOfSeats;
	
	public TicketBookingThread(TicketCounter counter, String passangerName, int numberOfSeats) {
		
		this.counter = counter;
		this.passangerName = passangerName;
		this.numberOfSeats = numberOfSeats;
		
		
	}

	@Override
	public void run() {
		
		counter.bookTicket(passangerName, numberOfSeats);
		
	}

}
