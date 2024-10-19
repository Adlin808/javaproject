package com.inh;
class parent{
	void show() {
		System.out.println("Parent class");
	}
}
class child extends parent{
	void show() {
		System.out.println("Child class");
		super.show();//super is used to call overriding methods
		}
}
public class FunctionoverloadingMain {
	public static void main(String[] args) {
		child cob=new child();
		cob.show();
		parent pob=new child();
		pob.show();//calls parent class method directly
	}


}
//super can be called anywhere in polymorphism whereas super should be called first in inheritance
