package com.edu;
class StringOverload{
	void check(String str,char ch) {
		int charcount=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);//ch1=s ch1=u
			if(ch1==ch) {//check s==s,u==s,c==s,c==s
				charcount++;//charcount=3(s,s,s)
				}
			}
		System.out.println("No.of "+ch+" present "+charcount+" times");
		
	}
	void check(String str) {
		String s=str.toLowerCase();//change EdubrideIndia to edubridgeindia
		//extract vowels
		System.out.println("Vowels present in a string");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
	    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
	    	System.out.print(ch+",");
	    }
		}
		System.out.println();
	}
	public void reversestr(String s) {
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
public class FunctionOverloadStrMain {
	
	public static void main(String[] args) {
	StringOverload ob=new StringOverload();//create an object
	ob.check("success",'s');
	ob.check("EdubridgeIndia");
	ob.reversestr("computer");
}
}	


