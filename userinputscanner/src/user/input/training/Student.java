package user.input.training;

import java.util.Scanner;

public class Student {
	public static void main(String[] args){
		String sname;
		int sage;
		float stotalmarks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		sname=sc.nextLine();
		System.out.println("Enter age:");
		sage=sc.nextInt();
		System.out.println("Enter total marks:");
		stotalmarks=sc.nextFloat();
		
		System.out.println("Student Details");
		System.out.println("Student name:"+sname);
		System.out.println("Student age:"+sage);
		System.out.println("Student totalmarks:"+stotalmarks);
		
		
	}

}
