package com.edu;
//creating thread by extending thread
class Myclass extends Thread{
//override the the method from Thread class
	public void run() {
		System.out.println("Child Thread "+Thread.currentThread());
	
}
}
public class ThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());//Parent Thread
		Myclass sob=new Myclass();//first thread
		// sob.setName("first"); //change the Thread name
		sob.start();
		Myclass sob1=new Myclass(); //second thread 
		//sob1.setName("second"); //change the Thread name
		sob1.start();
		}

}

