package pack2;

import pack1.Student;

public class StudentPublic {
	
	public static void main(String[] args) {
		Student s=new Student();
		//s.coursename="BTECH";
		//s.display();
		Student s1=new Student(101,"Adlin");
		s1.coursename="BTECH";
		s1.display();
		}

}
