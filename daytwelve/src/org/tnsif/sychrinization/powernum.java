//program on synchronization
//calculting the power
package org.tnsif.sychrinization;
public class powernum {
	synchronized void printpower(int num)
	{
		int x=1;
		for( int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+num+"^"+ i +"value: "+num*x);
			
			x=num*x;
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
