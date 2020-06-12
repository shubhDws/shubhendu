package com.thread.HelperMethods;

import java.util.Map;

public class MapHelper3 implements Runnable{
	
	Map<String,Integer> map;
	public MapHelper3(Map<String,Integer> map){
		this.map = map;
		new Thread(this,this.getClass().getName()).start();
	}
	
	@Override
	public void run(){
		map.put("three", 3);
		try{
			System.out.println(Thread.currentThread().getName() + "is sleeping");
			Thread.sleep(100);
		}catch(Exception e){e.printStackTrace();}
	}

}
