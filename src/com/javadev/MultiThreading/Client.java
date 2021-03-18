package com.javadev.MultiThreading;

public class Client {
	
	// main class

	public static void main(String[] args) {
		
		TicketCounter counter = new TicketCounter();
		
		TicketBookingThread tb1 = new TicketBookingThread(counter, "Devi", 2);
		Thread t1 = new Thread(tb1);
		t1.start();
		
		TicketBookingThread tb2 = new TicketBookingThread(counter, "Raja", 2);
		Thread t2 = new Thread(tb2);
		t2.start();
		
	}

}

//this output no showing good bcoz two threads are access on single resource, what i will do is

//Hello: Raja 2 seat available
//Hello: Devi 2 seat available ---> without synchronize

//Hello: Raja 2 seat available
// Devi, for u No seats available  --> with synchronize

// Bhai hela
