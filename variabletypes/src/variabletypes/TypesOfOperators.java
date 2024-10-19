package variabletypes;

public class TypesOfOperators {
	public static void main(String[] args) {
		int a=23;
		int b=2;
		//unary operator
		
		int c=a++;//Post increment
		int d=++b;//pre increment
		int e=a%b;
		int f=a/2;
		int g=a--;//post decrement
		int h=--b;//pre decrement
		//Negation operator
		boolean flag=false;
		System.out.println("!flag:"+!flag);
		
		
		System.out.println("c:"+c+" d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("g:"+g);
		System.out.println("h:"+h);
		
		//Inverting the value of a boolean
		int xx=100;
		System.out.println("Negation of XX:"+(~xx));
		int a11=10;
		//Left shift double the no
		System.out.println("Left  :::"+(a11<<1));
		System.out.println("Left  :::"+(a11<<2));
		
		int b11=5;
		//Right shift half the no
		System.out.println("Right  :::"+(b11>>1));
		System.out.println("Right  :::"+(b11>>2));
		//Relational operators
		 int no1=10;
		 int no2=20;
		 System.out.println("Equal: " +(no1==no2));
		 System.out.println("Not equal: " +(no1!=no2));
		 System.out.println("Less than: " +(no1<no2));
		 System.out.println("Greater than: " +(no1>no2));
		 System.out.println("Greater than or equal: " +(no1>=no2));
		 System.out.println("Less than or equal: " +(no1<=no2));
		 //Assignment operator
		 int num1=5;
		 System.out.println("Number1="+num1);
		 
		 int num2=10;
		 System.out.println("Number2="+num2);
		 num1+=num2;
		 num1-=num2;
		 num1/=num2;
		 num1%=num2;
		 num1*=num2;
		 
		 //Arithmetic operators
		 double output;
		 //Additional operator
		 output=num1+num2;
		 System.out.println("num1+num2:" +output);
		 //Subtraction operator
		 output=num1-num2;
		 System.out.println("num1-num2" +output);
		 //Multiplication operator
		 output=num1*num2;
		 System.out.println("num1*num2:" +output);
		 //Division operator
		 output=num1/num2;
		 System.out.println("num1/num2" +output);
		 //Remainder operator
		 output=num1%num2;
		 System.out.println("num1%num2" +output);
		 //Bitwise operator
		 int f1=8;
		 int f2=26;
		 System.out.println("Bitwise AND: " +(f1&f2));
		 System.out.println("Bitwise OR: " +(f1|f2));
		 System.out.println("Bitwise  xor:" +(f1^f2));

		 //Logical operator
		 int f3=24;
		 boolean result;
		 //Logical OR operator
		 result=(f1>f2)||(f2>f3);
		 //result will be true bcas f2 is greater than f3
		 System.out.println("LOgical OR:" +result);
		 //Logical AND operator
		 result=(f1>f2)&&(f2>f3);
		 //result will be false bcas f1 is lesser than f2
		 System.out.println("LOgical AND:" +result);
		 //Ternary operator
		 int a2=20;
		 int b2=30;
		 int max=a2>b2?a2:b2;//condition?true:false
		 System.out.println("Max:" +max);
		 //Another method
		 int no=23;
		 String res=no%2==0?"Even":"odd";
		 System.out.println("Result:" +res);
		 if(no%2==0) {
			 System.out.println("Even");
		 }
		 else {
			 System.out.println("Odd");
//ternary using 3 number
			 int a3=5;
			 int b3=10;
			 int c3=4;
			 int max1=(a3>b3)?(a3>c3?a3:c3):(b3>c3?b3:c3);
			 System.out.println("Maximum among:"+a3+"," +b3+ " and " +c3+ " is "  +max1);
			 
			 
			 

		 }


		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}
}
