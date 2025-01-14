package com.edu;

interface Figure{
	void draw();
}
/*class Reactangle implements Figure{

	@Override
	public void draw() {
		System.out.println("Draw method");
		
	}
	
}*/
public class LambdaExpression {

	public static void main(String[] args) {
		//Reactangle rob=new Reactangle();
		//rob.draw();
		//or
		Figure fob=new Figure() {

			@Override
			public void draw() {
				System.out.println("Draw method");
				
			}
       };
       //or
	fob.draw();
	
	new Figure() {

		@Override
		public void draw() {
			System.out.println("Draw method1");
			
		}
   }.draw();
//java 8 feature
   //Lambda Expression
   
   Figure ob=()->{ //lambda expression with no argument and no return type
	  
		  System.out.println("Draw method is called"); 
	};
	ob.draw();
}
}

