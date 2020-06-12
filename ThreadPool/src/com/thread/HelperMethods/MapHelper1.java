package com.thread.HelperMethods;

import java.util.Map;

public class MapHelper1 implements Runnable{
	
	Map<String,Integer> map;
	public MapHelper1(Map<String,Integer> map){
		this.map = map;
		new Thread(this,this.getClass().getName()).start();
	}
	
	@Override
	public void run(){
		map.put("one", 1);
		try{
			System.out.println(Thread.currentThread().getName() + "is sleeping");
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
