package com.thread.tasks;

public class ReaderWriter {

	 int i = 0;
	 boolean set = false;

	public synchronized  void writer() {
		i++;
		if (i == 2) {
			set = true;
			notify();
		}
	}

	public synchronized  void reader() {
		while(!set){
			try {
				System.out.println("waiting in while");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		if (set) {
			int j = i;
			System.out.println(j);
		} else {
			System.out.println("Waiting.");
			
			
		}
	}
}
