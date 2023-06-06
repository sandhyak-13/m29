package org.tnsif.threding;

public class Childthread extends Thread {
	person p;
	public Childthread(person p)
	{
		this.p=p;
		start();
	}
	public void run()
	{
		p.setName("Abc");
		System.out.println(p);
	}

}
