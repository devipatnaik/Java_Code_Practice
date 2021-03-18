package com.javadev.MultiThreading;

class MyRunningTask implements Runnable {

	@Override
	public void run() {

		System.out.println("from run() method of Runnable");

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Running Thread name : "+Thread.currentThread().getName());
			}
		} catch (Exception e) {

		}
	}

}


public class AllRunningThread {

	public static void main(String[] args) {

		MyThreadTask task = new MyThreadTask();

		Thread t = new Thread(task);
		t.start();
		
		Thread t1 = new Thread(task);
		t1.start();
		
		Thread t2 = new Thread(task);
		t2.start();
	}

}

