/** 
 * Author: Sandra Hawkins
 * Date:   8 Sep 2017
 * OCA_Revision/chapter6Exceptions/FromBookP312.java
 */ 

package chapter6Exceptions;

import java.io.IOException;

public class FromBookP312 {

	public static void main(String[] args) throws Exception {

		try {
			throw new RuntimeException();
			
		} catch (RuntimeException e) {
			throw new RuntimeException();
			
		} finally {
			throw new Exception(); 
		}
	}
	
	void aMethod() throws IOException {
		//throw new IllegalArgumentException();
		//throw new Exception();
	}
}
