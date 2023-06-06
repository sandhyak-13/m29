package org.tnsif.threding;

public class Accountthread extends Thread{
	Account acc;
	int amount;
	public Accountthread(Account acc, int amount)
	{
		this.acc=acc;
		this.amount =amount;
		start();
	}
	public void run()
	{
	//	synchronized(acc)
		//{
			System.out.println(Thread.currentThread());
			acc.withdraw(amount);
		//}
	}

}