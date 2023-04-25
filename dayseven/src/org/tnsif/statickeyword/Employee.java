//static varible program
package org.tnsif.statickeyword;

public class Employee {
	//non static data menmber
	private int empid;
	private String empname ;
	
	//static data menmber
	static String campanyname ="TNS india";

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	

}
