package org.tnsif.decisionMaking;
import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the age and weight of donor");
		 int age =sc.nextInt();
		 int weight =sc.nextInt();
		 if(age>18 && weight >50)
		 {
			 System.out.println("eligibal to donate ");
		 }
		 else
		 {
			 System.out.println("eligibal to donate not");
		 }
		 
		 

	}

}
