package oops;
class Department{
	public int did;
	private String dname;
	//getter and setter
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Department(int did,String dname) {
		super();
		this.did=did;
		this.dname=dname;
	
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		Department d=new Department();
		d.setDid(101);
		d.setDname("IT");
		System.out.println("Department id: "+d.getDid());
		System.out.println("Department  name: "+d.getDname());
		System.out.println("***********************");
		Department d1=new Department(102,"Sales");
		System.out.println(d1);
		

	}

}
