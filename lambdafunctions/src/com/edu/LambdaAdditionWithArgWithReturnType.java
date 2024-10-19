
package com.edu;
@FunctionalInterface
interface Addition{
	int add(int a, int b);
}
@FunctionalInterface
interface Subtraction{
	int sub(int a, int b);
}
@FunctionalInterface
interface Mulitiplication{
	int mul(int a, int b);
}
public class LambdaAdditionWithArgWithReturnType {

	public static void main(String[] args) {
		Addition aob=( a, b)->a+b;
		//int ans=aob.add(2, 8);
       System.out.println("sum="+aob.add(5, 4));
       
       Subtraction sob=(a,b)->a-b;
       System.out.println("Diff="+sob.sub(8,2));
       
       Mulitiplication mob=(a,b)->(a*b);
       System.out.println("Product="+mob.mul(2, 8));
	}

}

