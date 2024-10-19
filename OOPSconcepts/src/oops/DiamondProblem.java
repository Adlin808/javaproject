package oops;
interface Parent1{
	void disParent1();
	
}
interface Parent2{
	void disParent2();
	
}
interface Parent3 extends Parent1,Parent2{
	void disParent3();
	
}
class Child implements Parent3{
	public void disParent1() {
		System.out.println("Parent 1 method");
	}
	public void disParent2() {
		System.out.println("Parent 2 method");
	}
	public void disParent3() {
		System.out.println("Parent 3 method");
	}
	
}

public class DiamondProblem {

	public static void main(String[] args) {
		Child c=new Child();
		c.disParent1();
		c.disParent2();
		c.disParent3();
		
		// TODO Auto-generated method stub

	}

}
