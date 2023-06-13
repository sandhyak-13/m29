package org.tnsif.regularexpression;

import java.util.Scanner;

public class patternclass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string :");
		String input =sc.next() ;
		String pattern ="hey there  is regular expression ";
		boolean result =pattern.matches(pattern);
		System.out.println(result);

	}

}
