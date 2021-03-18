package com.javadev.MultiThreading;

public class DeadLockDemo {

	private String s1 = "Devi";
	private String s2 = "Patnaik";
	
	
	// t1 tries to lock s1 then s2  // s1 and s2 are resources
	// Thread-1
	Thread t1 = new Thread() {

		public void run() {

			synchronized (s1) {
				try {
					System.out.println(Thread.currentThread().getName() + " : locked " + s1);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			//}
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + " : locked " + s2);
				}
			}

		}

	};
	// Thread-2
	// t2 tries to lock s2 then s1  // s1 and s2 are resources
	Thread t2 = new Thread() {

		public void run() {

			synchronized (s1) {
				try {
					System.out.println(Thread.currentThread().getName() + " : locked " + s1);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + " : locked " + s2);
				}
			}

		}

	};
	
	public static void main(String[] args) {
		
		DeadLockDemo obj = new DeadLockDemo();
		obj.t1.start();
		obj.t2.start();
	}

}
