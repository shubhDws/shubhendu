package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for (int i = 0; i < 10; i++) {
			//Thread t1 = new Thread(new Task());
			//t1.start();
			service.execute(new Task());
		}
	}

}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Hi There");
	}

}
