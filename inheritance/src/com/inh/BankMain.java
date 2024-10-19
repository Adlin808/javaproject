package com.inh;
class bank{
	float rateofinterest() {
		return 0;
	}
}
class SBI extends bank{
	float rateofinterest() {
		return 8.4f;
	}
}
class HDFC extends bank{
	float rateofinterest() {
		return 7.3f;
	}
}
class ICICI extends bank{
	float rateofinterest() {
		return 9.7f;
	}
}
public class BankMain {
	public static void main(String[] args) {
		bank b;
		b=new SBI();
		System.out.println("SBI rate of interest:"+b.rateofinterest());
		b=new HDFC();
		System.out.println("HDFC rate of interest:"+b.rateofinterest());
		b=new ICICI();
		System.out.println("ICICI rate of interest:"+b.rateofinterest());
		
	}

}
