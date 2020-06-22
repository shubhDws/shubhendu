package coding.inerview.ThreadsOnly;

import java.util.List;

public class Thread2 extends Thread {

	List<String> strList;
	long repeat;
	String s;

	public Thread2(List<String> sList, long n, String s) {
		this.strList = sList;
		this.repeat = n;
		this.s = s;
	}

	@Override
	public void run() {
		if (repeat > 0) {
			for (long i = 1; i <= repeat; i++) {
				strList.add(s);
				// str = str.append(s);
			}
		}
	}

}
