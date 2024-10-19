package oops;
class vehicle{
	int speed=100;
	String t="Car";
	vehicle(String type){
		t=type;
		System.out.println("SUPER CLASS VEHICLE CONSTRUCTOR");
}
	void display() {
		System.out.println("Vehicle:" +t);
	}
}
class Bike1 extends vehicle{
	int speed=80;
	String brand;
	Bike1(String type,String brand){
		super(type);
		this.brand=brand;
		System.out.println("Sub class bike constructor");
	}
	//Bike1(String type,String brand){
		//super(type);
		//System.out.println("Type:"+type);
		//System.out.println("Type of parent:" +super(type));
		//System.out.println("I am Bike===="+brand);
	//}
	void display() {
		super.display();
		System.out.println("Speed:"+speed);
		System.out.println("Speed of vehicle:"+super.speed);
	}
	
}

public class SuperEx {

	public static void main(String[] args) {
		Bike1 b=new Bike1("Bike","BMW");
		b.display();
		// TODO Auto-generated method stub

	}

}
