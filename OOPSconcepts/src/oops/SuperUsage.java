package oops;
class Animal{
	String type="Animal";
	String eat;
	void stay() {
		System.out.println("animal staying in forest and city");
	}
	Animal(String eat){
		this.eat=eat;
	}
}
class Dog extends Animal{
	String color;
	Dog(String eat,String color){
		super(eat);
		this.color=color;
	}
	String type="Domesticanimal";
	void typeAnimal() {
		System.out.println("Type for animal:"+super.type);
	}
	void stay() {
		super.stay();
		System.out.println(color+" Dog stating in houses and ate " + eat);
		
	}
}

public class SuperUsage {

	public static void main(String[] args) {
		Dog d=new Dog("Milk","Black");
		d.typeAnimal();
		d.stay();
		// TODO Auto-generated method stub

	}

}
