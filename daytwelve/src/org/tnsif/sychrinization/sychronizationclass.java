//without synchronization 
package org.tnsif.sychrinization;
public class sychronizationclass {

	public static void main(String[] args) {
		
		powernum op=new powernum();
		Thredone t1 =new Thredone(op);
		thredtwo t2=new thredtwo(op);
		t1.start();
		t2.start();

	}

}
