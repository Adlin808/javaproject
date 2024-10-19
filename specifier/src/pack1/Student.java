package pack1;

public class Student {
	public String coursename;
	public int sid;
	public String sname;
	public Student() {
		System.out.println("Student class constructor");
	}
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	public void display() {
		System.out.println("Student data : "+coursename);
		System.out.println("Student name :"+this.sname+" sid: "+this.sid);
	}

}


