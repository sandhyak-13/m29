//program on abstract class and abstract method 
package org.tnsif.abstractkeyworddemo;
public abstract class Remote {
	//if any class declare as a abstract then that class must contain one abstarct method 
	
	public String name;
	//abstract class can have contain abstract and non abstact method
	//abstract method 
	abstract void functionremote();
	abstract void create();
	
	void display()
	{
		System.out.println("cell name  " +name);
	}
	
}

//implentable class
class Remotechild extends Remote
{
	@Override 
	void functionremote()
	{
		
	System.out.println("Abstact method");
	}
	@Override 
	void create ()
	{
		
	System.out.println("Abstact method 2");
	}

	
}
