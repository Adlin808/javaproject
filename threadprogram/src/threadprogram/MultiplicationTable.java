package threadprogram; 
class ThreadFirst extends Thread{
	public void run() {
		System.out.println("Thread1");
		int num=10;
		for(int i=1;i<=10;i++) {
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			System.out.println(num + "*" + i + "=" +num * i);
		}
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("Thread2");
		for(int i=11;i<=15;i++) {
			/*try {
				Thread.sleep(3000);//will get result after 3 sec
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
			System.out.println(i);
		}
	}
}

public class MultiplicationTable {

	public static void main(String[] args) {
		ThreadFirst t=new ThreadFirst();
		t.setName("ThreadOne");
		System.out.println("Thread name:" +t.getName());
		System.out.println("Min priority "+Thread.MIN_PRIORITY);
		System.out.println("Max priority "+Thread.MAX_PRIORITY);
		System.out.println("Normal priority "+Thread.NORM_PRIORITY);
		t.setPriority(8);
		System.out.println("Priority for t1 "+t.getPriority());
		t.start();
		ThreadTwo t1=new ThreadTwo();
		t1.setPriority(2);
		t1.start();

	}

}
