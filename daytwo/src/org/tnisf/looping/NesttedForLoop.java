//program for nested for loop
package org.tnisf.looping;

public class NesttedForLoop {

	public static void main(String[] args) {
		// print star sequare pattern
		int row =4,column =4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
