//craeting a thred using thred class
package org.tnsif.multithreding;
public class Threadprogram extends Thread {
	public  void run()
	{
		System.out.print("Thred is in running state");
	}

	public static void main(String[] args) {
		//Threadprogram.run();
		Threadprogram t=new Threadprogram();
		t.start();
		//if thred is in starting and running state we can not start again
		//t.start();
		
		

	}

}
