package com.thread.pool;

import com.thread.tasks.ReaderWriter;

public class TheadConcurrency {

	
	
	public static void main(String[] args) {
		
		
		
		Thread t1 = new Thread(() -> new ReaderWriter().writer(), "writerThread");
		Thread t2 = new Thread(() -> new ReaderWriter().writer(), "writerThread");
		Thread t3 = new Thread(() -> new ReaderWriter().reader(),"ReaderThread");
		t1.start();
		t2.start();
		t3.start();
	}

}
