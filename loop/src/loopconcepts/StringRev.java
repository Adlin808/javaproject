package loopconcepts;

public class StringRev {
	public static String revString(String s) {
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
			reversed=reversed+s.charAt(i);
	}
		return reversed;
	}
	

	public static void main(String[] args) {
		String s="Hello world";
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
			reversed=reversed+s.charAt(i);
		}
		System.out.println("Original string:"+s);
		System.out.println("Reversed string:"+reversed);
		System.out.println("Reversed string using function:"+revString("Welcome"));
		System.out.println("Reversed string using function:"+revString("Hi"));
		String strr="String";
		StringBuffer sb=new StringBuffer();
		sb.append(strr);
		System.out.println("Reversed string:"+sb.reverse());
		
		// TODO Auto-generated method stub

	}

}
