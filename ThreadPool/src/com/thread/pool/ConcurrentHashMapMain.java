package com.thread.pool;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.thread.HelperMethods.MapHelper1;
import com.thread.HelperMethods.MapHelper2;
import com.thread.HelperMethods.MapHelper3;
import com.thread.HelperMethods.MapHelper4;

public class ConcurrentHashMapMain {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<>();
		//Map<String,Integer> synchHashMap = Collections.synchronizedMap(hashMap);
		Map<String,Integer> concurrentMap = new ConcurrentHashMap<>();
		new MapHelper1(concurrentMap);
		new MapHelper2(concurrentMap);
		new MapHelper3(concurrentMap);
		new MapHelper4(concurrentMap);
		
		for(Map.Entry<String, Integer> map : concurrentMap.entrySet()){
			System.out.println(map.getKey() + ":" + map.getValue());
		}
	}

}
