package user.input.training;

	import java.util.Scanner;

	public class Employee {
		public static void main(String[] args){
			String Ename;
			int Eage;
			String Edept;
			int Ecode;
			int Esalary;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name:");
			Ename=sc.nextLine();
			System.out.println("Enter age:");
			Eage=sc.nextInt();
			System.out.println("Enter department:");
			Edept=sc.next();
			System.out.println("Enter code:");
			Ecode=sc.nextInt();
			System.out.println("Enter salary:");
			Esalary=sc.nextInt();
			
			System.out.println("Employee Details");
			System.out.println("Employee name:"+Ename);
			System.out.println("Employee age:"+Eage);
			System.out.println("Employee department:"+Edept);
			System.out.println("Employee code:"+Ecode);
			System.out.println("Employee salary:"+Esalary);
			
		}

	}
	


