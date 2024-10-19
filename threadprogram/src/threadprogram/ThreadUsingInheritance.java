package threadprogram;
class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("Thread2");
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}
}
class Thread3 extends Thread{
	public void run() {
		System.out.println("Thread3");
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadUsingInheritance {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();//thread is born
		t1.start();//Runnable----run()method called
		Thread2 t2=new Thread2();
		t2.start();
		Thread3 t3=new Thread3();
		t3.start();
		
	

	}

}
