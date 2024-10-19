package controlstatements;
import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		int operator;
		int number1,number2,result;
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter number 1");
		number1=Sc.nextInt();
		System.out.println("Enter number 2");
		number2=Sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2 subtraction");
		System.out.println("3 Multiplication");
		System.out.println("4 Division");
		System.out.println("5 Modulus");
		System.out.println("6 Exit");
		System.out.println("Enter your Choice(1-6)");
		int choice=Sc.nextInt();
		
		//operator=Sc.next().charAt(0);
		switch (choice) {
		case 1:{
			result=number1+number2;
			System.out.println("Addition:"  +result);
			break;}
	    case 2:{
		result=number1-number2;
		System.out.println("Subtraction:"  +result);
		break;}
	    case 3:{
			result=number1*number2;
			System.out.println("Multiplication:"  +result);
			break;}
	    case 4:{
		result=number1/number2;
		System.out.println("Division:"  +result);
		break;}
	    case 5:{
			result=number1%number2;
			System.out.println("Modulus:"  +result);
			break;}
	    case 6:{
			System.out.println("Exit");
			break;}
		
		// TODO Auto-generated method stub

	}

}
}
