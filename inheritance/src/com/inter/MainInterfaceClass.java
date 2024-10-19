package com.inter;
interface Myinterface{
	int i = 35;//all variables are by default they are public static final
	void m1();//methods are public and abstract
}
interface inter2 extends Myinterface{
	void m3();
}
class product implements inter2{
	@Override
	public void m1() {
		System.out.println("Interface");
	}
	@Override
	public void m3() {
		System.out.println("Sec interface");
	}
}
class Myclass implements Myinterface{
	String name;
	@Override
	public void m1() {
		System.out.println("Interface method implementation");
		System.out.println("The value of i =" +i); 
		
	}
	void m2() {
		name="Kiran";
		System.out.println("Name="+name);
				
		
	}
}
public class MainInterfaceClass {
	public static void main(String[] args) {
		//object creation is not possible for interface
		//Myinterface ob1=new Myinterface();//error
		Myclass ob=new Myclass();
		ob.m1();
		ob.m2();
		Myinterface ob1=new Myclass();//allocate memory only for inheritance
		ob1.m1();

	}

}
