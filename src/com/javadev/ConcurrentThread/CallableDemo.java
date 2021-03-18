package com.javadev.ConcurrentThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		
		Stream<String> stream1 = Stream.of("abc","def","ghi","lmn");
		Stream<String> stream2 = Stream.of("pqr","stu");
		Stream<String> stream3 = Stream.of("xyz");
		
		SimpleTask task1 = new SimpleTask(stream1);
		SimpleTask task2 = new SimpleTask(stream2);
		SimpleTask task3 = new SimpleTask(stream3);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Future<Integer> feture1 = service.submit(task1);
		Future<Integer> feture2 = service.submit(task2);
		Future<Integer> feture3 = service.submit(task3);
		
		Integer res1 = feture1.get();
		Integer res2 = feture2.get();
		Integer res3 = feture3.get();
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		service.shutdown();

	}

}


class SimpleTask implements Callable<Integer>{
	
	private Stream<String> stream = null;
	
	public SimpleTask(Stream<String> stream) {
		this.stream = stream;
	}

	@Override
	public Integer call() throws Exception {
		
		return  (int) stream.count();
	}
	
}