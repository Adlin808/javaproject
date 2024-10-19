package user.input.training;

import java.util.Scanner;

public class UserInputData {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer value:");//getting input from user
		int i=sc.nextInt();
		System.out.println("The integer value is:"+i);//display accepted data
		
		System.out.println("Enter float value:");
		float f=sc.nextFloat();
		System.out.println("The float value is:"+f);
		
		System.out.println("Enter double value:");
		double d=sc.nextDouble();
		System.out.println("The double value is:"+d);
		
		System.out.println("Enter byte value:");
		byte b=sc.nextByte();
		System.out.println("The byte value is:"+b);
		
		System.out.println("Enter short value:");
		short s=sc.nextShort();
		System.out.println("The short value is:"+s);
		
		System.out.println("Enter character:");
		char ch=sc.next().charAt(0);
		System.out.println("The character is:"+ch);
		
		System.out.println("Enter first name:");
		String firstname=sc.next();
		System.out.println("The first name is:"+firstname);
		
		System.out.println("Enter lastname");
		String lastname=sc.next();
		System.out.println("The lastname is:"+lastname);
		}

		}


		
		
		
