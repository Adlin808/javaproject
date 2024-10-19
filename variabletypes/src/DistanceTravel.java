import java.util.Scanner;

public class DistanceTravel {
	public static void main(String[] args) {
		int U=10;
		int A=5;
		//float d=U*t+((A*t*t)/2);
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter time duration in seconds:");
		int t1=Sc.nextInt();
		//System.out.println("Time:" +t1);
		//System.out.println("Enter time duration in seconds:");
		int t2=Sc.nextInt();
		//System.out.println("Time:" +t2);
		float D1=U*t1+((A*t1*t1)/2);
		float D2=U*t2+((A*t2*t2)/2);
		System.out.println("Distance travelled:" +D1);
		System.out.println("Distance travelled:" +D2);
		
		
		
		
	}	
		

	}

