package oops;
abstract class Animall{
	abstract void disAnimal();
}
class Lion extends Animall{
	void disAnimal() {
		System.out.println("Animal class Display from lion");
	}
	void nameLion() {
		System.out.println("JACK");
	}
}
class Tiger extends Animall{
	void disAnimal() {
		System.out.println("Animal class Display from tiger");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Lion l=new Lion();
		l.disAnimal();
		l.nameLion();
		//we can't create object of abstract class
		//but we create reference of abstract class
		Animall aref;
		aref=l;
		aref.disAnimal();
		Tiger t=new Tiger();
		t.disAnimal();
		

	}

}
