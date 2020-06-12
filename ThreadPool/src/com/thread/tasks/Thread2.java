package com.thread.tasks;

public class Thread2 extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello t2");
			try{Thread.sleep(500);} catch(Exception e){}
		}
	}


}
