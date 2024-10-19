package oops;
//import oops.OuterClass.InnerClass;
class OuterClass{
	String oname="Outer variable";
	void disOuter() {
	System.out.println("Outer class:"+oname);}
	class InnerClass{
		String name="Inner variable";
		void disInner() {
		System.out.println("Inner class:"+name);}
	}
	
}

public class NestedClass {

	public static void main(String[] args) {
		OuterClass n =new OuterClass();
		OuterClass.InnerClass in=n.new InnerClass();	
		n.disOuter();
		in.disInner();

	}

}
