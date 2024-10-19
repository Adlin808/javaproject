//HAS-A relation: Having an object of one class into another class
package com.inh;
class Employee1{
	float salary;
	 Employee1(){
		 salary=20000;
		 System.out.println("Employee constructor");
	  }
}
class programmer1 extends Employee{
	float bonus,totsal;
	Employee1 eob1=new Employee1();//HAS-A relation
	public programmer1() {
		bonus=800;
		System.out.println("Programmer constructor");
		}
	void totalsalary() {
		totsal=eob1.salary+bonus;
		System.out.println("programmer total salary="+totsal);
		
	}
}

public class EmpMain1 {
	public static void main(String[] args) {
		programmer1 pob=new programmer1();
		pob.totalsalary();
	}

}
