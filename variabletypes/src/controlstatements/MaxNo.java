package controlstatements;
import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		//Find maximum numbers
		if (a>b && a>c) {
			System.out.println(a + " is max");
		}
			else if(b>a && b>c) {
				System.out.println(b + " is max");
					}
			else
			{
				System.out.println(c + " is max");
			
		}
		//check whether number is +ve or -ve
		if(a>0) {
			System.out.println(a + " is positive");
		}
		else if(a<0) {
			System.out.println(a + " is negative");
		}
		else {
			System.out.println(a + " is zero");
		}
		//check whether no id odd or even
		if(b%2==0)
		{
			System.out.println(b + " is even");
			}
		else {
			System.out.println(b + " is odd");
		}
		
		// TODO Auto-generated method stub

	}

}
