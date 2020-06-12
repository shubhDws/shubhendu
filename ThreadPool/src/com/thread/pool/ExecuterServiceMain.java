package com.thread.pool;

import com.thread.tasks.Counter;

public class ExecuterServiceMain {

	public static void main(String[] args) {
		
		
		
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0 ; i<1000;i++){
					c.increment();
				}
			}
		}, "Synch-Thread");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Count value is : " + c.count);

		
		// Thread1 t1 = new Thread1();
		// Thread2 t2 = new Thread2();
		// System.out.println("executing main thread");
		// t1.start();
		// try{Thread.sleep(10);}catch(Exception e) {}
		// t2.start();
//		Thread3 t3 = new Thread3();
//		Thread4 t4 = new Thread4();
//
//		Runnable run1 = () -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println("Hi t3");
//				try {
//					Thread.sleep(500);
//				} catch (Exception e) {
//				}
//			}
//
//		};
//
//		Thread thread1 = new Thread(run1);
//		Thread thread2 = new Thread(t4);
//
//		System.out.println("Threads are : " +  thread1.getName() + " : " + thread2.getName() + " : " + Thread.currentThread().getName());
//		thread1.start();
//		try {
//			Thread.sleep(10);
//		} catch (Exception e) {
//		}
//		
//		thread2.start();
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Printing threads complete");

	}

}
