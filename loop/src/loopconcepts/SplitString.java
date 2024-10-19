package loopconcepts;

public class SplitString {
	int countAm(String Str) {
		int count=0;
		//String str="I am good I am good";
		String arr[]=Str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"  :  "+arr[i]);
		}
		String Str1="Am";
		for(int i=0;i<arr.length;i++) {
			if(Str1.equalsIgnoreCase(arr[i])) {
			count++;
			}
		}
		return count;}
		

	public static void main(String[] args) {
		int count=0;
		String Str="I Am fime I Am fime Am I good Am";
		SplitString s=new SplitString();
		System.out.println(s.countAm(Str));
		
		/*int count=0;
		String str="I am good I am good";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"  :  "+arr[i]);
		}
		String Str1="Am";
		for(int i=0;i<arr.length;i++) {
			if(Str1.equalsIgnoreCase(arr[i])) {
			count++;*/
			}
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}


