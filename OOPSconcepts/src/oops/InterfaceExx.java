package oops;
interface Animals{
	void makeSound();
	default void typeAnimal() {
		System.out.println("Pet animal:Cow,Dog,cat");
	}
	static void stayAnimal() {
		System.out.println("Stay home or society");
	}
}
class Cow implements Animals{
	public void makeSound() {
		System.out.println("Sound of cow:Moo");
	}
	
}
class Dog1 implements Animals{
	public void makeSound() {
		System.out.println("Sound of Dog:Woof");
	}
	
}
class Cat implements Animals{
	public void makeSound() {
		System.out.println("Sound of Cat:Meow");
	}
	
}

public class InterfaceExx {

	public static void main(String[] args) {
		Cow c=new Cow();
		c.makeSound();
		Dog1 d=new Dog1();
		d.makeSound();
		Cat ca=new Cat();
		ca.makeSound();
		Animals aref;
		aref=c;
		c.typeAnimal();
		Animals.stayAnimal();
		
		// TODO Auto-generated method stub

	}

}
