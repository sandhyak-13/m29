package org.tnsif.classandobject;

import org.tnsif.encapsulation.HDFCBank;

public class EncapsulationDFemo {

	public static void main(String[] args) {
		HDFCBank h =new HDFCBank();
		//setter
		h.setCardno(451266542L);
		h.setCardtype("Credit");
		h.setCvvno(4444);
		h.setPinno(1001);
		//getter

		System.out.println(h.getCardno());
		System.out.println(h.getCardtype());
		System.out.println(h.getCvvno());
		System.out.println(h.getPinno());
		

	}

}
