package pack1;

public class Employee {
	protected int eid;
	protected String ename;
	protected Employee() {
		eid=1;
		ename="Adlin";
	}

	protected void display() {
		System.out.println("Eid :"+eid);
		System.out.println("Ename :"+ename);
		

	}

}
