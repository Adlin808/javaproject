package com.bank;

import com.bank.HDFC;
import com.bank.ICICI;
import com.bank.SBI;
import com.bank.bank;

public class BankMain {//Main class
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

