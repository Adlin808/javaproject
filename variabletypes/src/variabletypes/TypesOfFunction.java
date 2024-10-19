package variabletypes;

public class TypesOfFunction {
	//Function with no return type and no parameter
	void msg() {
		System.out.println("Message Function");
	}
	//Function with string return type
	String display() {
		return "My display method";
	}
	
	
	//Function with string return type and parameter
	String greeting(String s) {
		return "Hello"+s;
		}
	//Function return type int
	int add() {
		int a=4,b=5;
		return a+b;
		}
	//Function with return type int and parameter
	int mul(int a, int b) {
		return a*b;
	}
	//Function with return type float for static
	static float area(int r) {
		return(float)(3.14*r*r);
		
	}
	public static void main(String[] args) {
		TypesOfFunction t=new TypesOfFunction();
		t.msg();
		System.out.println(t.display());
		System.out.println(t.greeting("---<12615"));
		System.out.println("Additon:"+t.add());
		int m=t.mul(3,4);
		System.out.println("Multiplication:"+t.mul(3,4));
		int m1=t.mul(5,6);
		System.out.println("Multiplication:"+t.mul(5,6));
		System.out.println("Area:"+t.area(5));
			}
	}
