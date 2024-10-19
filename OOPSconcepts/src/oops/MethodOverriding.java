package oops;
//late binding:Run time polymorphism
//method name and parameters are same only we implement in super-sub class
//final and static method cant override
class Electronics{
	String item="Electronics";
	void display() {
		System.out.println("Electronics class called" +item);
	}
}
class laptop extends Electronics{//if methods are same need to use super keyword
	String item="Laptop";
	void display() {
		super.display();
		System.out.println("Laptop class called");
		System.out.println("Super class variable====="+super.item);
		System.out.println("Child(sub) class variable===="+item);
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		laptop l=new laptop();
		l.display();
		// TODO Auto-generated method stub

	}

}
