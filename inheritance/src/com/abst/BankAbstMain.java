package com.abst;
abstract class bank{
	abstract float getRateOfInterest();
	void display() {
		System.out.println("Display");
	}
}
class SBIBank extends bank{
	float getRateOfInterest() {
		return 7.9f;
	}
}

public class BankAbstMain {
	public static void main(String[] args) {
		bank ob=new SBIBank();
		System.out.println("Rate of interest="+ob.getRateOfInterest());
		ob.display();
	}

}
