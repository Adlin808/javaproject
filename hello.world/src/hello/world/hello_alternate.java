package hello.world;

public class hello_alternate {
	public static void main(String[] args){
		  int i=10;
		  byte b=126;
		  short s=567;
		  long l=876L;
		  float f=567.5f;
		  double d=98798.56;
		  char ch='A';
		  char chr=66;
		  boolean bool=true;
		  byte a,c,e;
		  a=123;
		  c=45;
		  e=(byte)(a+c);//a+c beyond the range,so explicit converter is used
		
		    
		  System.out.println("Integer value="+i);
		  System.out.println("byte value="+b);
	      System.out.println("short value="+s);
	      System.out.println("long value="+l);
	      System.out.println("float value="+f);
	      System.out.println("character value="+ch);
	      System.out.println("character value="+chr);
	      System.out.println("boolean value="+bool);
	      System.out.println("double value="+d);
	      System.out.println("byte value="+e);

}
}
