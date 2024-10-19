package controlstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		int grade=7;
		switch(grade) {
		case 10:{
			System.out.println("A+");
			break;}
		case 9:{
			System.out.println("A");
			break;}
		case 8:{
			System.out.println("B+");
			break;}
		case 7:{
			System.out.println("B");
			break;}
		case 6:{
			System.out.println("C");
			break;}
		case 5:{
			System.out.println("Pass");
			break;}
		default:
			System.out.println("Fail");
		}
		}
		
		
		// TODO Auto-generated method stub

	}


