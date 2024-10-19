package controlstatements;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		//byte-->short-->int-->long-->implicit type conversion(Widening)
		 double d=345.894d;
		 int ii=(int) d;
		 System.out.println("ii :"+ii);
		 //bigger data type-->smaller
		 //double-->int-->short-->byte-->Explicit scope(Narrowing)
		 int iii=800;
		 byte bb=(byte) iii;
		 System.out.println("bb :"+bb);
		 float f1=567.89f;
		 int no=(int) f1;
		 System.out.println("no :"+no);
		 String.format("%2g%n",0.912300);
		 //System.out.println("%2f",percentage);
		 
		 
		 
	}

}
