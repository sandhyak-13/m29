package org.tnsif.annoations;

import java.util.Set;
import java.util.TreeSet;
public class suppresswaringex {

	public static void main(String[] args) {
		
		/*
		 * we can remove the warning by using thebelow
		 * annonation
		 */
		@SuppressWarnings("Uncheckede")
		
		Set s =new TreeSet();
		//@SuppressWarnings("rawtype")
		s.add(45);
		s.add(34);
		s.add("sandhya");
		System.out.println(s);
		
		

	}

}
