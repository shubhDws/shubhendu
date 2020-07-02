package coding.interview.dataStructures;

import java.util.LinkedList;

public class LinkedListSample {
	
	private LinkedListSample(){}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.addFirst(15);
		System.out.println(list);
		
	}

}
