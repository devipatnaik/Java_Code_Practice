package com.javadev.ConcurrentThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		Runnable run1 = () -> {
			for(int i=0;i<3;i++) {
				System.out.println("Execute inside Thread-1");
			}
		};
		
		Runnable run2 = () -> {
			for(int i=0;i<3;i++) {
				System.out.println("Execute inside Thread-2");
			}
		};
		
		Runnable run3 = () -> {
			for(int i=0; i<3; i++) {
				System.out.println("Execute inside Thread-3");
			}
		};
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		service.submit(run1);
		service.submit(run2);
		service.submit(run3);
		
		service.shutdown();
		
	}

}
