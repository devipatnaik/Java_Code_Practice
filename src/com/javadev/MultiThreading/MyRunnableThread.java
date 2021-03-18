package com.javadev.MultiThreading;

class MyThreadTask implements Runnable {

	@Override
	public void run() {

		/*System.out.println("from run() method of Runnable");

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(" Thread name:  "+ Thread.currentThread().getName());
			}
		} catch (Exception e) {

		}*/
		
		System.out.println("Running Thread name : "+Thread.currentThread().getName());
		//System.out.println("Running Thread Priority : "+Thread.currentThread().getPriority());

	}

}


public class MyRunnableThread {

	public static void main(String[] args) {

		MyThreadTask task = new MyThreadTask();

		Thread t = new Thread(task);
		//t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		
		Thread t1 = new Thread(task);
		//t1.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		
		Thread t2 = new Thread(task);
		//t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}

}
