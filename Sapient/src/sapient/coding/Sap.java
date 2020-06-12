package sapient.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sap {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<>();
		Map<String, Double> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		double totalMarks = 0;
		String name = "";
		double temp = 0;
		listStudent.add(new Student("Ram", "maths", 90));
		listStudent.add(new Student("Manu", "maths", 85));
		listStudent.add(new Student("Ram", "science", 70));
		listStudent.add(new Student("Manu", "science", 80));

		for (Student s1 : listStudent) {
			set.add(s1.getSub());
		}

		for (Student s : listStudent) {
			if (map.containsKey(s.getName())) {
				map.put(s.getName(), (map.get(s.getName()) + s.getMarks()) / set.size());
			} else {
				map.put(s.getName(), (s.getMarks()) / set.size());
			}
		}

		//
		// Iterator<Map.Entry<String, Double>> itr = map.entrySet().iterator();
		//
		// while(itr.hasNext()){
		// Map.Entry<String, Double> map1 = itr.next();
		// }

		for (String st : map.keySet()) {

			if (map.get(st) > temp) {
				temp = map.get(st);
				name = st;
			}

		}

		System.out.println("Topper is " + name +  " with marks " + temp);

	}

}
