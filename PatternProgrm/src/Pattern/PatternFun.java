package Pattern;
import java.util.Scanner;

public class PatternFun {
	public static void triangle(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				}
			System.out.println();
			}		
		}
			



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of triangles:");
		int no=sc.nextInt();
		for(int i=0;i<=no;i++) {
			int n=sc.nextInt();
			triangle(n);
		}
		
		
	}
}
		
		// TODO Auto-generated method stub

	


