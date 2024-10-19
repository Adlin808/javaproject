package exceptionex;
class VoteException extends Exception{
	public VoteException(String msg) {
		super(msg);
	}
}

public class Demo1 {
	void CheckAgeForVote(int age) throws VoteException{
		if(age<18) {
			throw new VoteException("Invalid age for vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		try {
			d.CheckAgeForVote(10);
			
		}
		catch(VoteException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End of vote code");
			
		}
		

	}

}
