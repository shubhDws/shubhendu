package coding.interview.entity;

import java.util.Comparator;
import java.util.Map;

public class Compare implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) { 
	     
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       }

//	@Override
//	public int compare(Laptop o1, Laptop o2) {
//		if(o1.getCost() < o2.getCost()) return 1; else return -1;
//	}
	



