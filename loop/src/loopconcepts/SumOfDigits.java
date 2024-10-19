package loopconcepts;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int digit=0;
		int sum=0;
		int number=560;
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=Sc.nextInt();		*/
		
		while(number>0){
			digit=number%10;
			sum=sum+digit;
			number=number/10;
			}
		System.out.println("Sum of digits:" +sum);
		// TODO Auto-generated method stub
		
	}

}
