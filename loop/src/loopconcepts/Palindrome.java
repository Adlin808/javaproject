package loopconcepts;

public class Palindrome {

	public static void main(String[] args) {
		int rem=0;
		int sum=0;
		int temp;
		int num=454;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not palindrome");
		// TODO Auto-generated method stub

	}

}
