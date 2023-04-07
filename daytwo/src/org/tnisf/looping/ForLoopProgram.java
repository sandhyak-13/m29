//program to demonstrate on for loop
package org.tnisf.looping;
import java.util.Scanner;
public class ForLoopProgram {

	public static void main(String[] args) {
		//print 1 to N number 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			System.out.println(i+"");
		}
		sc.close();
		
	}

}
