package org.tnsif.dateandtime;
import java.time.Clock;
public class ClockClassExample {

	public static void main(String[] args) {
		Clock c1 = Clock.systemUTC();
		System.out.println(c1);
		
		Clock c2 = Clock.systemDefaultZone();
		System.out.println(c2);
		

	}

}
