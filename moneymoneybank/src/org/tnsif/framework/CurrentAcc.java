package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditlimit; 
	public CurrentAcc(int accno, String accnm, float accbal,float creditlimit) {
		super(accno, accnm, accbal);
		this.creditlimit=creditlimit;
	}

	public void withdraw(float accbal)
	{
		System.out.println("account no :"+this.getAccno()+
				"\naccount name :"+this.getAccnm()+
				"\ncurrent balance is :"+(this.getAccbal())+
				"\nbalance is :"+(this.getAccbal()-accbal)+
				"\ncredit limit :"+this.creditlimit);
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditlimit=" + creditlimit + "]";
	}
	
	

}
