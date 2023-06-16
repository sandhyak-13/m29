package org.tnsif.client;
import org.tnsif.application.mmcurrentacc;
import org.tnsif.application.mmsavingacc;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class client {

	public static  void main(String[] args) {
	//BankFactory b=new mmbankfactory();
	SavingAcc p =new mmsavingacc(570,"sandhya khamgal",1000,true);
	CurrentAcc n =new mmcurrentacc(800,"sachin khamgal",2000,60);
	System.out.println("saving acc");
	p.deposite(200);
	System.out.println("current acc");
	n.withdraw(200);
	
	

	}

}
