package com.javadev.MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable {

	public ArrayBlockingQueue<String> queue;

	public Producer(ArrayBlockingQueue<String> queue) {

		this.queue = queue;

	}

	public void run() {
		synchronized (queue) {
			try {
				queue.put("1");
				Thread.sleep(1000);
				queue.put("2");
				Thread.sleep(1000);
				queue.put("3");
				Thread.sleep(1000);
				queue.put("4");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

class Consumer implements Runnable {

	public ArrayBlockingQueue<String> queue;

	public Consumer(ArrayBlockingQueue<String> queue) {

		this.queue = queue;
	}

	@Override
	public void run() {
		synchronized (queue) {
			try {
				System.out.println("Thread name : "+Thread.currentThread().getName()+"::"+queue.take());
				System.out.println("Thread name : "+Thread.currentThread().getName()+"::"+queue.take());
				System.out.println("Thread name : "+Thread.currentThread().getName()+"::"+queue.take());
				System.out.println("Thread name : "+Thread.currentThread().getName()+"::"+queue.take());
			} catch (Exception e) {

			}
		}

	}

}

public class BlockingQueue {

	public static void main(String[] args) throws Exception {

		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		Thread t1 = new Thread(producer);
		t1.start();
		Thread t2 = new Thread(consumer);
		t2.start();
	}
}
