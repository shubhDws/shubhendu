   package coding.inerview.ThreadsOnly;

import java.util.concurrent.Semaphore;

public class IncrementClass {

	int count;
	boolean valueSet = false;
	Semaphore semaphore = new Semaphore(1);
	Semaphore semaphoreZero = new Semaphore(0);

	public /*synchronized*/ void put() {
	
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		while (valueSet == true) {
//			try {
//				//wait();
//				semaphore.acquire();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		count++;
		System.out.println("Put " + count);
		//valueSet = true;
		//notify();
		semaphoreZero.release();
	}

	public /*synchronized*/ void get() {
		try {
			//semaphore.release();
			semaphoreZero.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		while (valueSet == false) {
//			try {
//				//wait();
//				semaphoreZero.acquire();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("Get " + count);
		//valueSet = false;
		//notify();
		semaphore.release();
		
	}

}
