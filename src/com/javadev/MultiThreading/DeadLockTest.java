package com.javadev.MultiThreading;

public class DeadLockTest {

	String s1 = "Devi";
	String s2 = "Patnaik";

	Thread t1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s1) {
					try {
						System.out.println(Thread.currentThread().getName() + " Locked "+s1);
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + " Locked "+s2);
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + " Locked " +s2);
					synchronized (s1) {
						System.out.println(Thread.currentThread().getName() + " Locked " +s1);
						System.out.println(s1 + s2);
					}
				}
			}
		}
	};

	public static void main(String[] args) {

		DeadLockTest test = new DeadLockTest();
		test.t1.start();
		test.t2.start();

	}
}
