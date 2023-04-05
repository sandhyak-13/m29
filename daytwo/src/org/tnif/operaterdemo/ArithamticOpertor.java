//program on arithmtic operator(+,-,/,*,%)
package org.tnif.operaterdemo;

import java.util.Scanner;

public class ArithamticOpertor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a two value  ");
		int x =s.nextInt();
		int y =s.nextInt();
		
		System.out.println("Addition is "+(x+y));
		System.out.println("Substartion is "+(x-y));
		System.out.println("multiplication is "+(x*y));
		System.out.println("Division is "+(x/y));
		System.out.println("Modules  is "+(x%y));
		s.close();
		

	}

}
