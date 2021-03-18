package com.javadev.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
	
	private static int data = 10;
	public static void main(String[] args) {
		
		CompletableFuture<String> cf = new CompletableFuture<>();
		
		CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data = 10;
		});
		

	}

}
