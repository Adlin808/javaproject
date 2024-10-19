package accessspecifier;
class Learner{
	int lid;
	String lname;
	public Learner() {
		lid=1;
		lname="Ohm";
		System.out.println("Default constructor");
		}
	public Learner(int lid,String lname){
		this.lid=lid;
		this.lname=lname;
		System.out.println("Parameterized constructor");
		}
	Learner(Learner l){
		lid=l.lid;
		lname=l.lname;
		System.out.println("Copy constructor");
		
	}
	 public String toString() {
		return "Learner [lid=" + lid + ", lname=" + lname + "]";
	}
	 void display() {
		 System.out.println("lid=" +lid+" ,lname=" +lname);
		 
	 }
}

public class ConstructorTypes {

	public static void main(String[] args) {
		Learner l=new Learner();//default constructor
		//System.out.println(l);
		l.display();
		Learner l1=new Learner(101,"Adlin");
		System.out.println(l1);
		Learner l2=new Learner(l);
		System.out.println(l2);
		
		
		// TODO Auto-generated method stub

	}

}
