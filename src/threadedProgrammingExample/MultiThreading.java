package threadedProgrammingExample;

public class MultiThreading extends Thread{
	private int thread_number;
	
	public MultiThreading(int t) {
		this.thread_number = t;
	}
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i+" is from : "+thread_number);
			
			try {
				Thread.sleep(1000);//sleep for 1000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
