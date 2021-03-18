package com.javadev.MultiThreading;

//Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
// The threads should display the messages continuously till the user presses ctrl+c. 

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		ThraedOne t1 = new ThraedOne("Thread One Running..");
		new Thread(t1).start();
		
		
		ThreadTwo t2 = new ThreadTwo("Thread Two Running..");
		new Thread(t2).start();
		
	}

}

class ThraedOne implements Runnable {
	
	String msg="";
	
	public ThraedOne(String s1) {
		this.msg = s1;
	}
	
	public void run() {
		try {
			while(true) {
				System.out.println(msg);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

class ThreadTwo implements Runnable {
	
	String msg="";
	public ThreadTwo(String s2) {
		this.msg = s2;
	}

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(msg);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			
		}
		
	}
	
}
