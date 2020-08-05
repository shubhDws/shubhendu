package coding.inerview.ThreadsOnly;

public class ProducerThread implements Runnable {

	IncrementClass incr;
	public ProducerThread(IncrementClass inc){
		this.incr = inc;
	}
	
	@Override
	public void run() {
		while(true){
			incr.put();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}