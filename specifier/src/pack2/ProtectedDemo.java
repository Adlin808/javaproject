package pack2;
import pack1.Employee;

class Emp extends Employee{
	Emp(){
	}
	void msg() {
		display();
	}
}

public class ProtectedDemo {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.msg();

	}

}
