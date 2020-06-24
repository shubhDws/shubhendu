package coding.interview.hashMap.challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoStringsChallenge {

	public String twoStrings(String s1, String s2) {

		String sBig = " ";
		String sSmall = " ";
		if (s1.length() > s2.length()) {
			sBig = s1;
			sSmall = s2;
		} else {
			sBig = s2;
			sSmall = s1;
		}
		Map<Character, Integer> mapBig = new LinkedHashMap<>();
		Map<Character, Integer> mapSmall = new LinkedHashMap<>();
		
		for (char c : sBig.toCharArray()) {
			if(mapBig.containsKey(c)){
			mapBig.put(c, mapBig.get(c)+1);
			}else{
				mapBig.put(c,1);
			}
		}
		System.out.println(mapBig);
		for (char c : sSmall.toCharArray()) {
			if (mapSmall.containsKey(c)) {
				mapSmall.put(c, mapSmall.get(c)+1);
				// System.out.println(map);
				// return "yes";
			} else {
				mapSmall.put(c, 1);
			}
		}
		
			for(Map.Entry<Character, Integer> mS : mapSmall.entrySet()){
				for(Map.Entry<Character, Integer> mB : mapBig.entrySet()){
				if(mS.getKey() == mB.getKey()){
					return "YES";
				}
			}}
		
		
		
		System.out.println(mapSmall);
		return "NO";
	}

	public static void main(String[] args) {

		String present = new TwoStringsChallenge().twoStrings("wouldyoulikefries", "abcabcabcabcabcabc");
		System.out.println(present);
	}

}
