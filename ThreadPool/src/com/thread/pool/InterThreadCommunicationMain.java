package com.thread.pool;

class Q {

	int num;
	boolean valueSet = false;
	public synchronized void put(int num) {
		System.out.println("still waiting");
		while(valueSet){
			try{wait();}catch(Exception e){}
		}
		
		System.out.println("put : " + num);
		this.num = num;
		valueSet = true;
	}

	public synchronized void get() {
		while(!valueSet){
			try{wait();}catch(Exception e){}
		}
		System.out.println("get : " + num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		System.out.println(t.getName());
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		System.out.println(t.getName());
		t.start();
	}

	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}
}

public class InterThreadCommunicationMain {
	
	public static void main(String[] args) {

		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}

}
