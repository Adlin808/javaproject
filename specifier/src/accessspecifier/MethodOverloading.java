package accessspecifier;
class Shape{
	//method overloading---early binding----compile time polymorphism
	//same method name but different parameters
	void area(int r) {
		System.out.println("Area of circle:" +(3.14*r*r));
	}
	void area(int l,int w) {
		System.out.println("Area of rectangle:" +(l*w));
}
	void area(int l,int w,int h) {
		System.out.println("Area of cylinder:" +(l*w*h));}
	void area(int l,float w) {
		System.out.println("Area of round rectangle:" +(l*w));}
}

public class MethodOverloading{
	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(3);
		s.area(3,6.7f);
		s.area(3,6);
		s.area(3,6,7);
	}
}

		
		

	


