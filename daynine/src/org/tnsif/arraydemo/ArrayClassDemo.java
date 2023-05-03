//program on array class demo
package org.tnsif.arraydemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		//aaray initialzation 
		int array[]= {12,67,54,90,87};
		//using array class we print all the element 
		System.out.println(Arrays.toString(array));
		//sorting element 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	
		
	}

}
