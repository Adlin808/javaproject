package threadprogram;

public class YieldProg implements Runnable{
	public void run(){
		System.out.println("Started "+Thread.currentThread());
		Thread.yield();
		System.out.println("Ended "+Thread.currentThread());
		
	}
	


	public static void main(String[] args) throws InterruptedException {
		YieldProg y1=new YieldProg();
		Thread t1=new Thread(y1,"First child thread");
		YieldProg y2=new YieldProg();
		Thread t2=new Thread(y2,"Second child thread");
		t1.start();
		t1.join();
		t2.start();
		
		// TODO Auto-generated method stub

	}

}
