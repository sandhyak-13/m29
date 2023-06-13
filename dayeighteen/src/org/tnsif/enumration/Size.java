package org.tnsif.enumration;

public enum Size implements pizza {
	SMALL ,MEDIUM ,LARGE;

	@Override
	public void displaysize() {
		System.out.println("size :"+this);
		
	}

}
