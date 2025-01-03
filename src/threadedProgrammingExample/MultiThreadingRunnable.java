package threadedProgrammingExample;

public class MultiThreadingRunnable implements Runnable{
	private int thread_number;
	
	public MultiThreadingRunnable(int t) {
		this.thread_number = t;
	}
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i+" is from : "+thread_number);
			
//			if(thread_number == 2)
//				throw new RuntimeException();
			
			try {
				Thread.sleep(1000);//sleep for 1000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}


}
