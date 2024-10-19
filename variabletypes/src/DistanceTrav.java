import java.util.Scanner;


public class DistanceTrav {
	public int distance(int t) {
		int u=10;
		int a=5;
		int dt=u*t+((a*t*t)/2);
		return dt;
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Time:");
		
		int t1=Sc.nextInt();
		int t2=Sc.nextInt();
		DistanceTrav d=new DistanceTrav();
		System.out.println(d.distance(t1));
		System.out.println(d.distance(t2));
		
		
		
		// TODO Auto-generated method stub

	}

}
