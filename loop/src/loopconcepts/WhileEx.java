package loopconcepts;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		while(true) {
			System.out.println("Click the 1- Add Details");
			System.out.println("Click the 2- Display of student details");
			System.out.println("Click the 3- Update of student details");
			System.out.println("Click the 4- Delete of student details");
			System.out.println("Click the 5- Exit");
			System.out.println("Enter the choice");
			int choice=Sc.nextInt();
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid Input");
					break;
				
			}
			
		}
		// TODO Auto-generated method stub

	}

}
