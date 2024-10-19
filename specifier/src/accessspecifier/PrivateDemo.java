package accessspecifier;
class Private{
	private String name="EB";}
public class PrivateDemo {
	private static int a=10;
	private PrivateDemo() {
		System.out.println("Private constructor");
		
	}
	private void msg() {
		System.out.println("Private method");
	}
	public static void main(String[] args) {
		System.out.println("Value of a:" +a);
		PrivateDemo p=new PrivateDemo();
		p.msg();
		//System.out.println("Name:"+p.name);

	}

}
