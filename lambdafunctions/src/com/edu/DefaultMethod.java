
package com.edu;
@FunctionalInterface
interface DefaultInterface{
	void add(int a, int b);
	//jdk 8
	default void mult(int a, int b) {
		 System.out.println("product="+(a*b));
	 }
		//jdk 9
	static void display() {
		System.out.println("static method in interface");
	}
	
}
public class DefaultMethod implements DefaultInterface{
	@Override
	public void add(int a, int b) {
		System.out.println("sum="+(a+b));
		
	}
	
	public static void main(String[] args) {
		
		DefaultInterface dob=new DefaultMethod();
		dob.add(4, 2);
		dob.mult(9, 2);
		DefaultInterface.display();
		
		DefaultInterface lob=(a,b)->{
			System.out.println("sum="+(a+b));
		};
		lob.add(2, 6);
		lob.mult(2, 9);
		
	}

	

}

