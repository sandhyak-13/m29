//program to demostrate logical operator 
package org.tnif.operaterdemo;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean result1 =(5>2) && (4==3);
		boolean result2 =(5>2) || (4==3);
		boolean result3 = !(3<=1);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
