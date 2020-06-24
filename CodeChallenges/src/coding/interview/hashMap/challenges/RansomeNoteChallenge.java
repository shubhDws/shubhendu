package coding.interview.hashMap.challenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RansomeNoteChallenge {
	public void checkMagazine(String[] magazine, String[] note) {
		
		boolean response = true;
		Map<String, Integer> map = new LinkedHashMap<>();
		Map<String, Integer> map1 = new LinkedHashMap<>();
		for (int i = 0; i < note.length; i++) {
			if (map.containsKey(note[i])) {
				map.put(note[i], map.get(note[i]) + 1);
			} else {
				map.put(note[i], 1);
			}
		}

		for (int j = 0; j < magazine.length; j++) {
			if (map1.containsKey(magazine[j])) {
				map1.put(magazine[j], map1.get(magazine[j]) + 1);
			} else {
				map1.put(magazine[j], 1);
			}
		}
		System.out.println(map);
		System.out.println(map1);
		for(String str : map.keySet()){
			if(map1.containsKey(str) && map1.get(str) >= map.get(str)){
				response = true;
			}else{
				response = false;
				break;
			}
		}
		if(response == true){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

	public static void main(String[] args) {
		String[] magazine = { "two", "times", "three", "is", "not", "four" };
		String[] note = { "two", "times", "two", "is", "four" };
		new RansomeNoteChallenge().checkMagazine(magazine, note);
	}

}
