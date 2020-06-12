package com.thread.tasks;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello t4");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}
}
