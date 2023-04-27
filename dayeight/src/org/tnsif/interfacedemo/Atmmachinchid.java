package org.tnsif.interfacedemo;

public class Atmmachinchid implements ATMmachin {

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount :-"+amountwith);
		
	}

	@Override
	public void deposit() {
		System.out.println("deposite amount  :-"+amountdepo);
		
	}
	
	

}
