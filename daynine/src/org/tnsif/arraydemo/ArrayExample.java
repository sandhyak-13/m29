//program on simple array
package org.tnsif.arraydemo;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		//runtime
		System.out.println("enter a number of element ");
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		//array declration
		int arr[]=new int[num];
		//array initialization
		for (int i =0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		//for printing the array element
		
		for (int itr :arr)
		{
			System.out.println("array element is :"+itr+" ");
			
		}
				
	}

}
