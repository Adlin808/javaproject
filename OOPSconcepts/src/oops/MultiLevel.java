package oops;
class Electronics1{
	void ele() {
		System.out.println("Parent class");
	}
}
class Lap extends Electronics1{
	void lap() {
		System.out.println("first Child class");
	}
}
class Mobile extends Lap{
	void mob() {
		System.out.println("Second child class");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Mobile mp=new Mobile();
		mp.ele();
		mp.lap();
		mp.mob();
		// TODO Auto-generated method stub

	}

}
