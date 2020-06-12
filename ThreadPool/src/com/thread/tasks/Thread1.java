package com.thread.tasks;

public class Thread1 extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi t1");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}

}
