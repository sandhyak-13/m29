package org.tnsif.enumration;

public class enumrationprogram {
	
	enum Margin
	{
		//enum constant
		TOP,BOTTOM,LEFT,RIGHT
	}

	public static void main(String[] args) {
		int count =10;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin:%d=%s \n",count++,m);
		}

	}

}
