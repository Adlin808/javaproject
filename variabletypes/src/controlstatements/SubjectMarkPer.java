package controlstatements;
import java.util.Scanner;


public class SubjectMarkPer {
	
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int mark1=Sc.nextInt();
		int mark2=Sc.nextInt();
		int mark3=Sc.nextInt();
		int score=mark1+mark2+mark3;
		int total=300;
		
		float per=(float)score/total*100;
		//System.out.println("Percentage:"+per);
		//System.out.format("%.2f",per);
		
		if (per>=90){
			System.out.println("A+");}
		else if(per>=80 & per<90){
			System.out.println("A");}
		else if(per>=70 & per<80){
			System.out.println("B+");}
		else if(per>=60 & per<70){
			System.out.println("B");}
		else if(per>=50 & per<60){
			System.out.println("C");}
		else if(per>=40 & per<50){
			System.out.println("Pass");}
		else {
			System.out.println("Fail");}
			}
			
			
		
		// TODO Auto-generated method stub

	}


