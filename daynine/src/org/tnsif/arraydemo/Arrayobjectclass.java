//program on array object class
package org.tnsif.arraydemo;

public class Arrayobjectclass {

	public static void main(String[] args) {
		//array of customer class
		Customer[] arr=new Customer[2];
		arr[0]=new Customer(23456,"Sandhya");
		arr[1]=new Customer(78566,"Sachin");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
		
		
		
		
		
		
	}

}
