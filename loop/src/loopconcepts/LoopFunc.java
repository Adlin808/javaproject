package loopconcepts;

public class LoopFunc {
	void SumOfDigitFun() {
		int no=456,d=0,sum=0;
		while(no!=0) {
			d=no%10;
			sum=sum+d;
			no=no/10;
		}
		System.out.println("Sum of Digits:" +sum);
	}
	static void printEven() {
		int n=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		LoopFunc s=new LoopFunc();
		s.SumOfDigitFun();
		printEven();
		System.out.println("Sum of digits:"+s.SumOfDigitFun());
		System.out.println("Sum of Digits:");
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
