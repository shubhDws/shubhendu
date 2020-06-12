package coding.interview.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import coding.interview.entity.Compare;
import coding.interview.entity.Mobile;
import coding.interview.entity.NonRepeatChar;
import coding.interview.entity.RotateList;

public class CodingPractice {

	public static boolean present(ArrayList<? extends Integer> aL, int i) {
		Optional<? extends Integer> n = aL.stream().filter(p -> p == i).findAny();

		if (n.isPresent()) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		
		Mobile mob = new Mobile("apple",1);
		Mobile mob1 = new Mobile("apple",1);
		System.out.println(mob.equals(mob1));
		System.out.println(mob.hashCode() + " " + mob1.hashCode() );
		System.exit(0);
		
		
		String s = "tesatter";
		NonRepeatChar.firstNonRepeatChar(s);
		List<Integer> listR = new ArrayList<>();
		listR.add(50);
		listR.add(30);
		listR.add(70);
		listR.add(40);
		listR.add(100);
		RotateList.rotate(listR,1);
		Map<Integer, String> map = new HashMap<>();
		map.put(22, "A");
		map.put(55, "B");
		map.put(33, "Z");
		map.put(44, "M");
		map.put(99, "I");
		map.put(88, "X");

		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> maps = (Map.Entry) it.next();
			System.out.println(maps.getKey() + " : " + maps.getValue());
		}

		Map<Integer, String> sortedMap = new TreeMap<>(map);
		System.out.println("after sorting on keys");
		Iterator<Map.Entry<Integer, String>> itSorted = sortedMap.entrySet().iterator();
		while (itSorted.hasNext()) {
			Map.Entry<Integer, String> sort = itSorted.next();
			System.out.println(sort.getKey() + ":" + sort.getValue());
		}

		System.out.println("After sorting on values");
		List list = new LinkedList(map.entrySet());
		Comparator<Object> cmp = new Compare();
		Collections.sort(list, (o1, o2) -> {return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it1 = list.iterator(); it1.hasNext();) {
			Map.Entry entry = (Map.Entry) it1.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		Iterator<Map.Entry<Integer, String>> sortByValue = sortedHashMap.entrySet().iterator();
		while (sortByValue.hasNext()) {
			Map.Entry<Integer, String> sort = sortByValue.next();
			System.out.println(sort.getKey() + ":" + sort.getValue());
		}

		// LinkedList<String> ls = new LinkedList<>();
		// ls.add("test");
		// ls.add("sudo");
		//
		// HashSet<String> hs = new HashSet<>();
		// hs.add("dummy");
		// hs.add("tasty");
		//
		// List<String> l = new ArrayList<>(hs);
		// String[] ar = new String[hs.size()];
		//
		// Collections.reverse(l);
		// hs.toArray(ar);
		// List<Laptop> lp = new ArrayList<>();
		//
		// lp.add(new Laptop(150, "4gb", "HP"));
		// lp.add(new Laptop(100, "2gb", "lenovo"));
		// lp.add(new Laptop(200, "8gb", "Acer"));
		// lp.add(new Laptop(500, "4gb", "vaio"));
		// lp.add(new Laptop(900, "8gb", "apple"));

		// Comparator<Laptop> cp = (o1, o2) -> { return o1.getCost() <
		// o2.getCost()?1:-1;};

		// Collections.sort(lp, (o1, o2) -> { return o1.getCost() <
		// o2.getCost()?1:-1;});
		//
		// for (Laptop l : lp) {
		// System.out.println(l);
		// }

		// ArrayList<Integer> aL = new ArrayList<>();
		// aL.add(1);
		// aL.add(2);
		// aL.add(3);
		//
		//
		// if(CodingPractice.present(aL, 3)){
		// System.out.println("Number is present");
		// }else System.out.println("Number not present");

		// Map<String,String> map = new HashMap<>();
		// map.clear();
		// map.put("a", "google");
		// map.put("B", "youtube");
		// map.put("F", "insta");
		// map.put("c", "tiktok");
		// map.putIfAbsent("c", "tiktok");
		// map.put("e", "instaOverrule");
		//
		// for(Integer key : map.keySet()){
		// System.out.println(map.get(key));
		// }

		// Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		// while(it.hasNext()){
		// Map.Entry<Integer,String> maps = it.next();
		// System.out.println(maps.getValue());
		// }

		// for(Map.Entry<String, String> mE : map.entrySet()){
		// System.out.println(mE.getKey() + " : " + mE.getValue());
		// }

	}
}
