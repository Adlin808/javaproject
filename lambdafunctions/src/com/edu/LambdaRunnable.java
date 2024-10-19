package com.edu;

public class LambdaRunnable {
	public static void main(String[] args) {
		Runnable rob=()->{
			System.out.println("Run method is called");
	};
	Thread t=new Thread(rob);
	t.start();
}

}
