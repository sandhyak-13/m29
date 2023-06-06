//generic class program
package org.tnsif.generics;

class GenericClass<T>{ 
	
	T x;
	void print (T x)
	{
		this.x=x;
	}
	T accept ()
	{
		return x;
	}
	
}
public class GenericClassExample{
	public static void main(String[] args) {
		GenericClass<Character>obj=new GenericClass<>();
		obj.print('s');
		System.out.println(obj.accept());
		
		
	}

}
