package collectionframewrk;

import java.util.ArrayList;
import java.util.Iterator;

class Department{
	private int did;
	private String dname;
	private String dlocation;
	
	public Department(int did, String dname, String dlocation) {
		super();
		this.did = did;
		this.dname = dname;
		this.dlocation = dlocation;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + "]";
	}
	
		
	}
	


public class DepartmentCRUD {

	public static void main(String[] args) {
		ArrayList<Department> alist=new ArrayList<>();
		alist.add(new Department(101,"IT","Mumbai"));
		alist.add(new Department(102,"Sales","Chennai"));
		alist.add(new Department(103,"Marketing","Pune"));
		alist.add(new Department(104,"Development","Bangalore"));
		System.out.println("My Department: "+alist);
		alist.remove(1);
		System.out.println("After remove department");
		
		Iterator<Department> dt=alist.iterator();
		while(dt.hasNext()) {
			System.out.println(dt.next());
		}
		

	}

}
