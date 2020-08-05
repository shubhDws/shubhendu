package coding.inerview.ThreadsOnly;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		IncrementClass incr = new IncrementClass();
		Thread pThread = new Thread(new ProducerThread(incr));
		Thread cThread = new Thread(new ConsumerThread(incr));
		pThread.start();
		cThread.start();
	}
}
