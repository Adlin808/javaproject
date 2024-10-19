package oops;
class Electronics2{
	void elec() {
		System.out.println("Parent class");
	}
}
class lap extends Electronics2{
	void lap() {
		System.out.println("1 child class derived from parent");
	}
}
class mobile extends Electronics2{
	void mob() {
		System.out.println("2 child class Derived from parent");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		mobile mb=new mobile();
		mb.elec();
		//mb.lap();//returns exception
		mb.mob();
		
		lap lp=new lap();
		lp.elec();
		lp.lap();
		//lp.mob();//returns exception
		// TODO Auto-generated method stub

	}

}
