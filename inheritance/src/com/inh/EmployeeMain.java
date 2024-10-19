package com.inh;
class Employee{
	float salary;
	  Employee(){
		  salary=20000;
		  System.out.println("Employee constructor");
	  }
}
class programmer extends Employee{//java supports only single inheritance through class
	                              // inheritance : IS-A relation
	float bonus,totsal;
	public programmer() {
		bonus=800;
		System.out.println("Programmer constructor");
		}
	void totalsalary() {
		totsal=salary+bonus;
		System.out.println("programmer total salary="+totsal);
		
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		programmer ob=new programmer();
		ob.totalsalary();
	}

}
