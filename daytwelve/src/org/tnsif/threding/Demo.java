package org.tnsif.threding;

public class Demo {

	public static void main(String[] args) {
		/*person p =new person();
		p.setId(101);
		p.setName("sandhya");
		Childthread  t1 =new Childthread(p);
		Childthread  t2 =new Childthread(p);
		*/
		Account account =new Account();
		account.setId(101);
		account.setName("sak");
		account.setBalance(500000);
		
		Accountthread t1 =new Accountthread(account,120000);
		Accountthread t2 =new Accountthread(account,110000);
		Accountthread t3 =new Accountthread(account,100000);
		Accountthread t4 =new Accountthread(account,90000);
		Accountthread t5 =new Accountthread(account,80000);
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(account);

	}

}
