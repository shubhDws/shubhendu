package com.thread.HelperMethods;

import java.util.Map;

public class MapHelper2 implements Runnable{
	
	Map<String,Integer> map;
	public MapHelper2(Map<String,Integer> map){
		this.map = map;
		new Thread(this,this.getClass().getName()).start();
	}
	
	@Override
	public void run(){
		map.put("two", 2);
		try{
			System.out.println(Thread.currentThread().getName() + "is sleeping");
			Thread.sleep(100);
		}catch(Exception e){e.printStackTrace();}
	}

}
