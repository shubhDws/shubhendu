package coding.interview.entity;

import java.util.ArrayList;
import java.util.List;

public class RotateList {

	public static void rotate(List<Integer> list ,int n) {

		

		for(int i = 1; i<=n; i++){
			list.add(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);
		}
		System.out.println(list);
		System.exit(0);
	}

}
