package variabletypes;

class VariableDema2 {

	static int count = 0;//static 
    int cnt = 0;// Instance
    public void increment() {
        count++;
    }
    public void incre() {
        cnt++;
    }


	}

public class VariableDema{
	public static void main(String[] args) {
		VariableDema2 v=new VariableDema2();
		v.increment();
		System.out.println("Count static :"+VariableDema2.count);
		VariableDema2 v1=new VariableDema2();
		v1.increment();
		System.out.println("Count static 2 time :"+VariableDema2.count);
		VariableDema2 v2=new VariableDema2();
		v2.incre();
		System.out.println("Count instance :"+v2.cnt);
		VariableDema2 v3=new VariableDema2();
		v3.incre();
		System.out.println("Count instance :"+v3.cnt);
		
		
	}
	
}
