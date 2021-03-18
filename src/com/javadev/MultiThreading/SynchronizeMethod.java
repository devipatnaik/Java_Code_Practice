package com.javadev.MultiThreading;

class SynchronizeTask {
	
	public synchronized void m1() throws InterruptedException {
		
		for(int i=5; i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	// Non Synchronized method
	public  void m2() throws InterruptedException {
		
		for(int i=5; i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	
	
}

class SyncThread1 implements Runnable {
	
	SynchronizeTask task1;
	
	public SyncThread1(SynchronizeTask task1) {
		this.task1 = task1;
	}

	@Override
	public void run(){
		
		try {
			task1.m1();
			task1.m2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class SyncThread2 implements Runnable {
	
	SynchronizeTask task2;
	
	public SyncThread2(SynchronizeTask task2) {
		this.task2 = task2;
	}

	public void run() {
		try {
			task2.m1();
			task2.m2();
		} catch (Exception e) {
		}
	}
}


public class SynchronizeMethod {
	
	public static void main(String[] args) {
		
		SynchronizeTask task = new SynchronizeTask();  // only one object
		
		SyncThread1 st1 = new SyncThread1(task);
		SyncThread1 st2 = new SyncThread1(task);
		
		Thread t1 = new Thread(st1);
		Thread t2 = new Thread(st1);
		
		t1.start();
		t2.start();
	}

}


