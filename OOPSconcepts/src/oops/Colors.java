package oops;

interface Flower {
	void color();// abstract method without body

}

class Rose implements Flower {
	public void color() {
		System.out.println("The colour of rose is red");

	}
}

class Jasmine implements Flower {

	@Override
	public void color() {
		System.out.println("The colour of jasmine is white");
		
	}
}

class Lotus implements Flower {

	@Override
	public void color() {
		System.out.println("The colour of lotus is pink");
	}
	

}

public class Colors {

	public static void main(String[] args) {
		Rose ro = new Rose();
		ro.color();
		Jasmine ja = new Jasmine();
		ja.color();
		Lotus lo = new Lotus();
		lo.color();
		

	}

}
