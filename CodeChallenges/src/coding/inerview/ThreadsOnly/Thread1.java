package coding.inerview.ThreadsOnly;

import java.util.List;

public class Thread1 implements Runnable {
	
	StringBuffer strBfr = new StringBuffer();
	List<String> strList;
	long repeat;
	String s;

	public Thread1(List<String> sList, long n, String s) {
		this.strList = sList;
		this.repeat = n;
		this.s = s;
	}

	@Override
	public void run() {
		if (repeat > 0) {
			System.out.println("first thread started loop");
			for (long i = 1; i <= repeat; i++) {
				//strList.add(s);
				 strBfr = strBfr.append(s);
			}
			System.out.println("First thread loop ends" + strBfr);
		}
	}

}