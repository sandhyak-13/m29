package org.tnsif.annoations;
class car {
	public void speed(int speed)
	{
		System.out.println("speed is "+speed+"km/hr");
	}

}
//child class
class Lamborghini extends car
{
	/*
	 * below annotation ensure that child class method 
	 * is inherting the properties of parent class
	 */
	@Override
	//it should be speed(int speed)
	//if we do speed (int speed),then we will get an error
	public  void speed(int speed)
	{
		System.out.println("speed is "+speed+"km/hr");
	}
}

public class overridenannotation {

	public static void main(String[] args) {
		Lamborghini l1 =  new Lamborghini();
		l1.speed(90);

	}

}
