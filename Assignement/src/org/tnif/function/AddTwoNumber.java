package org.tnif.function;

import java.util.Scanner;

public class AddTwoNumber {
	
	public static int add1(int a ,int b)
	{
		int c =a+b;
		return c;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		AddTwoNumber ab=new AddTwoNumber();
		System.out.println("Addition is "+ab.add1(a,b));
		sc.close();


	}

}
