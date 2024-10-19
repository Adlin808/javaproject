package com.edu;

@FunctionalInterface
interface Hello{
	void sayHello(String s);
}
public class LambdaWithArg {

	public static void main(String[] args) {
		Hello sob=(s)->{  //Lambda expression with arg
			System.out.println("Hello "+s);
		};
		sob.sayHello("Vishal");
	}

}

