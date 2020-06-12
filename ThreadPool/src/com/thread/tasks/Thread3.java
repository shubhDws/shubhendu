package com.thread.tasks;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi t3");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}

}
