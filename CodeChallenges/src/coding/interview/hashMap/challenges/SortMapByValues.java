package coding.interview.hashMap.challenges;

import java.nio.channels.NetworkChannel;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(12, 56);
		map.put(13, 17);
		map.put(14, 98);
		map.put(10, 11);
		map.put(9, 8);

		System.out.println(map);
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(entrySet);
		/*Comparator<Map.Entry<Integer, Integer>> c = new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

				return (o1.getValue()).compareTo(o2.getValue());
			}

		};*/
		// Collections.sort(list,c);
		/**
		 * -------------------using lambda expressions------------------------
		 **/
		Collections.sort(list, (o1,o2) -> (o1.getValue()).compareTo(o2.getValue()));

		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> m : list) {
			sortedMap.put(m.getKey(), m.getValue());
		}
		System.out.println(sortedMap);

	}
}
