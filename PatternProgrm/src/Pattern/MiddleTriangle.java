package Pattern;
import java.util.Scanner;

public class MiddleTriangle {
	public static void triangle(int n) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
				//System.out.print(i+" ");
				//System.out.print("* ");
				
			}
			System.out.println();		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Pattern numbers to get middle triangle");
		int n=sc.nextInt();
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		triangle(n);
		//triangle(n1);
		//triangle(n2);
		}
		
		
	}


