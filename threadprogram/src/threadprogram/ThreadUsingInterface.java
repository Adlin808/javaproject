package threadprogram;
class ThreadOne implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
		
	}
	
}

public class ThreadUsingInterface {

	public static void main(String[] args) {
		ThreadOne t1=new ThreadOne();
		Thread t=new Thread(t1);
		t.start();
		// TODO Auto-generated method stub

	}

}
