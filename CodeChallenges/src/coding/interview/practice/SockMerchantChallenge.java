/**The Sock merchant has to identify the number of pairs present in a shop as per their colour**/

package coding.interview.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchantChallenge {

	public static void main(String[] args) {

		List arr = Arrays.asList("red", "blue", "yellow", "red", "blue", "red", "yellow");
		Map<String,Integer> map = new HashMap<>();
		int pair = 0;
		System.out.println(1/2);
		
		for(int i = 0; i < arr.size(); i++){
			if(map.containsKey(arr.get(i))){
				map.put(arr.get(i).toString(), (map.get(arr.get(i)) + 1));
			}else {
				map.put(arr.get(i).toString(), 1);
			}
		}
		
		for(Map.Entry<String, Integer> m : map.entrySet()){
			
			System.out.println(m.getKey() + " : " + m.getValue());
			pair = pair + m.getValue()/2;
			
		}
		System.out.println("total pair : " + pair);
		
		
		
		
//		for (int i = 0; i < arr.size(); i++) {
//			int count = 1;
//			for (int j = i+1; j < arr.size(); j++) {
//				if (arr.get(i).equals(arr.get(j))) {
//					 count++;
//				}
//			}
//			pair = pair + count/2;
//		}
//
//		System.out.println("total pair  : " + pair);
	}

}
