package org.tnsif.sychrinization;
public class Thredone extends Thread {
	powernum p;
//paramerterized constructor
	public Thredone(powernum p) {
		super();
		this.p = p;
	}
	
	public void run()
	{
		p.printpower(5);
	}
	

}
