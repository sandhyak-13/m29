//program user input  program
package org.tnif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in );
		System.out.println("Enter a salary ");
		float salary =s.nextFloat();
		
		System.out.println("Enter a name  ");
		String name =s.next();//only 1st letter print
		s.nextLine();
		
		System.out.println("Enter a name  ");
		String name1 =s.nextLine();//whole line print
		
		System.out.println("Enter a charter   ");
		char ch =s.next().charAt(3);
		
		
		System.out.println(" salary is "+salary );
		System.out.println(" name  is "+name );
		System.out.println(" name2  is "+name1 );
		System.out.println(" charter   is "+ch);
		s.close();
		

	}

}
