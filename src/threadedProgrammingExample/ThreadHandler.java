package threadedProgrammingExample;

public class ThreadHandler {

	public static void main(String[] args) {
//		MultiThreading t1 = new MultiThreading(1);
//		MultiThreading t2 = new MultiThreading(2);
//		MultiThreading t3 = new MultiThreading(3);
//		
//		t1.start();
//		t2.start();
//		t3.start();

		
		MultiThreadingRunnable t1 = new MultiThreadingRunnable(1);
		Thread tt1 = new Thread(t1);
		MultiThreadingRunnable t2 = new MultiThreadingRunnable(2);
		Thread tt2 = new Thread(t2);
		MultiThreadingRunnable t3 = new MultiThreadingRunnable(3);
		Thread tt3 = new Thread(t3);
		
		tt1.start();
		tt2.start();
		tt3.start();
	}

}
