package loopconcepts;
import java.util.Scanner;

public class SumOfNatNum {

	public static void main(String[] args) {
		int num=5;
		int i=1;
		int sum=0;
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=Sc.nextInt();*/
		while(i<=5) {//or (i<=num)
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of N numbers:" +sum);
		
		// TODO Auto-generated method stub

	}

}
