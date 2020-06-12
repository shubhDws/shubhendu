package coding.interview.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepeatChar {
	
	public static void firstNonRepeatChar(String s){
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println("String passes is : " + s);
		System.out.println(map);
		
		for(int i=0; i<s.length();i++){
			if(map.get(s.charAt(i)) == 1){
				System.out.println(s.charAt(i));
				System.exit(0);
			}
		}
		System.exit(0);
	}

}
