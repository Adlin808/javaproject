package loopconcepts;

public class RevNum {
	


	public static void main(String[] args) {
		int num=123;
		int rev=0;
		System.out.println("Original number:"+num);
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
			System.out.println("Reverse number:"+rev);
			
			
		}
		
		

		// TODO Auto-generated method stub

	

}
