package threadprogram;

public class NotifyWait {
	public static int balance=0;
	public synchronized void withdraw(int amount) throws InterruptedException{
		if(balance<=0) {
			System.out.println("Waiting for balance to be updated");
			wait();
		}
		balance=balance-amount;
		System.out.println("The cuurent balance is "+balance);
	}
	public synchronized void deposit(int amount) {
		System.out.println("Depositing "+amount);
		balance=balance+amount;
		notify();
	}

	public static void main(String[] args) {
		NotifyWait main=new NotifyWait();
		//Thread for withdrawing money
		Thread thread1=new Thread(()->{
			try {
				main.withdraw(1000);
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		});
		thread1.setName("Withdraw Thread");
		
		//Thread for depositing money
		Thread thread2=new Thread(()->main.deposit(2000));
		thread2.setName("Deposit Thread");
		//start threads
		thread1.start();
		thread2.start();
		// TODO Auto-generated method stub

	}

}