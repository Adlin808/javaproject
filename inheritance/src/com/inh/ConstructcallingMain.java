package com.inh;
class base{
	private int i;
	base(int i){//i=8
		this.i=i;
		System.out.println("The value of i="+i);
	}
}
class subclass extends base{
	subclass(int j){//j=8
		super(j);//Super is used to call parent class constructor from child class
		         //when you are calling super should be the first line
	}
}
public class ConstructcallingMain {
	public static void main(String[] args) {
		subclass sob=new subclass(8);
	}

}
//We can't use this and super together 