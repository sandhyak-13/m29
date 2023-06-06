package org.tnsif.sychrinization;

public class thredtwo  extends Thread {
	powernum p;
	//paramerterized constructor

	public thredtwo(powernum p) {
		super();
		this.p = p;
	}

	public void run()
	{
		p.printpower(3);
	}

}
