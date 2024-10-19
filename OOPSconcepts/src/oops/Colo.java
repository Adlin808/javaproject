package oops;
interface flow{
	void col();
	default void flwe() {
		System.out.println("Rose,Jasmine,Lotus");
	}
	static void ty() {
		System.out.println("Type:Flower");
	}
}
class ro implements flow{
	public void col() {
	System.out.println("Colour of rose is red");}
	
}
class jas implements flow{
	public void col() {
		System.out.println("Clour of jasmine is white");}
	}
	class lot implements flow{
		public void col() {
			System.out.println("Colour of lotus is white");
		}
	}



public class Colo {

	public static void main(String[] args) {
		ro r=new ro();
		r.col();
		jas j=new jas();
		j.col();
		lot l=new lot();
		l.col();
		flow aref;
		aref=r;
		r.flwe();
		flow.ty();
		
			
		
	}
		// TODO Auto-generated method stub

	}


