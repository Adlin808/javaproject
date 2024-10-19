package com.edu;

public class NoOfDigitsMain {
	public static void main(String[] args) {
		/*int num=23451,c=0;
		while(num>0){
			num=num/10;
			System.out.println(num);
			c++;
		}
		System.out.println("Number of digits="+c);*/
		int num=23451,c=0,d;
		while(num>0){
			d=num%10;
			System.out.println("d=num%10,remainder="+d);
			num=num/10;
			System.out.println("num=num1/10,Num="+num);
			c++;
		}
		System.out.println("Number of digits="+c);


	}
	}
         