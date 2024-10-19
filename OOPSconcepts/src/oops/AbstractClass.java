package oops;
abstract class course{
	String cname="JFS";
	abstract void discoursecategory();//method without body
	void cname() {
		System.out.println("CourseName:" +cname);
	}
}
class HTML extends course{
	void discoursecategory() {
		System.out.println("Frontend");
	}
}
class CSS extends course{
	void discoursecategory() {
		System.out.println("Frontend css");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		HTML h=new HTML();
		h.discoursecategory();
		h.cname();
		CSS c=new CSS();
		//c.discoursecategory();
		course cref;
		cref=c;
		cref.discoursecategory();
		// TODO Auto-generated method stub

	}

}
