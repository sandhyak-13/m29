package org.tnsif.secondpackge;
import org.tnisf.firstpackge.*;

public class Executor {

	public static void main(String[] args) {
		Base b =new Base();
		//if any method is deafult we cannot acess into another packge
		b.methodpublic();
	}

}
