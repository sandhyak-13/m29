package org.tnsif.statickeyword;

public class SticKeywordExecuter {

	public static void main(String[] args) {
		//without cratring object static varible call 
		System.out.println(Employee.campanyname);
		Employee e1 = new Employee(12,"sak");
		System.out.println(e1);
		
		
		Employee e2 = new Employee(121,"sandhya");
		System.out.println(e2);
		
		Customer .display();
		Customer c =new Customer();
		System.out.println(c);
	}

}
