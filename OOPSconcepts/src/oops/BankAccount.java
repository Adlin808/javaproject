package oops;

class BankAccount {
	private double balance;
	private int accountNumber;
	private String ownerName;
	public BankAccount(double balanc,int accountNumber,String ownerName) {
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.ownerName=ownerName;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public double withdraw(double amount) {
		//check if the balance is sufficient for the withdrawal
		if(balance<amount) {
			System.out.println("Insufficient balance");
			return 0;
		}
		balance=balance-amount;
		return amount;//return the amount withdrawn
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(5000,101,"Adlin");
		ba.deposit(7000);
		System.out.println(ba.getBalance());
		ba.withdraw(4000);
		System.out.println("After withdraw:" +ba.withdraw(8500));
		System.out.println("After withdraw:" +ba.getBalance());
		// TODO Auto-generated method stub

	}

}
