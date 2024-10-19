package accessspecifier;
//default in subclass
class Vehicle1 {//parent
	void display() {
		System.out.println("Display vehicle method");}
	}
class Car extends Vehicle1{//child
	String cname="BMW";
	void displayCar() {
		display();
		System.out.println("My car : "+cname);
		}
	}
public class Vehicle{
	public static void main(String[] args) {
		Car c=new Car();
		c.displayCar();
		}
	}
