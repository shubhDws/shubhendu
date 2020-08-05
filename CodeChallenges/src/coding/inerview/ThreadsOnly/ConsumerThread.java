package coding.inerview.ThreadsOnly;

public class ConsumerThread implements Runnable {

	IncrementClass incr;
	public ConsumerThread(IncrementClass inc) {
		this.incr = inc;
	}
	@Override
	public void run() {
		while (true) {
			incr.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
