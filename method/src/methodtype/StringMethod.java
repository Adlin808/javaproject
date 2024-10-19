package methodtype;

public class StringMethod {

	public static void main(String[] args) {
		String s=new String("Java Programming Language");
		String s1="hi";
		String s2="Hi";
		String s3="Java";
		System.out.println("Length:"+s.length());
		System.out.println("Char At:"+s.charAt(8));
		System.out.println("Char At:"+s.charAt(0));
		System.out.println("UpperCase:"+s.toLowerCase());
		System.out.println("Concat:"+s1.concat("Everyone"));
		System.out.println("MyString:"+s1);
		System.out.println("Equals:"+s1.equals(s2));
		System.out.println("Equals ignore:"+s1.equalsIgnoreCase(s2));
		System.out.println("Index of:"+s.indexOf('a'));
		System.out.println("Last index of:"+s.lastIndexOf('a'));
		System.out.println("Compare:"+s2.compareTo(s1));
		System.out.println("Contains:"+s.contains(s3));
		String s5=" ";
		System.out.println("Blank:"+s5.isBlank());
		System.out.println("Empty:"+s5.isEmpty());
		String s6="Hi All!";
		System.out.println(s6.substring(0,7));
		System.out.println("Length:"+s6.length());
		System.out.println("Trim:"+s6.trim().length());
		String s7="Welcome";
		System.out.println("Replace:"+s7.replace('W' ,'D'));
		System.out.println("Starts with :"+s7.startsWith("oe"));
		System.out.println("End with:"+s7.endsWith("me"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
