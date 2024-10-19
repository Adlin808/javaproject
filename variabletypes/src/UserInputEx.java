import java.util.Scanner;

public class UserInputEx {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=Sc.nextLine();
		System.out.println("Name:" +name);
		System.out.println("Enter your Age:");
		int age=Sc.nextInt();
		System.out.println("Age:" +age);
		System.out.println("Enter your percentage:");
		float percentage=Sc.nextFloat();
		System.out.println("Percentage:" +percentage);
		System.out.println("Enter your grade:");
		char ch=Sc.next().charAt(0);//charAt(0) returns character at position 0
		System.out.println("Grade:" +ch);
		
		
		// TODO Auto-generated method stub

	}

}
