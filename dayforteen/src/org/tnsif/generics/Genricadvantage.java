package org.tnsif.generics;

import java.util.List;
import java.util.ArrayList;


public class Genricadvantage {

	public static void main(String[] args) {
		//1.typesafety
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(56);
		//list.add(23.56);
		System.out.println(list);
		
		//2. before gnerics typecasting is  allowed 
		ArrayList arr1 =new ArrayList();
		arr1.add("st.john");
		System.out.println(arr1);
		String str=(String)arr1.get(0);
		System.out.println(str);
		
		
		//3. in gnerics typecasting is not  nessaery
		ArrayList<String > arr2 =new ArrayList<>();
		arr2.add("st.john");
		System.out.println(arr2);
		String str1=arr2.get(0);
		System.out.println(str1);

	}

}
