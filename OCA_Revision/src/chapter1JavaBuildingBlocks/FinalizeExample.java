package chapter1JavaBuildingBlocks;
/** 
 * Author: Sandra Hawkins
 * Date:   4 Aug 2017
 * SandraTestingStuff//FinalizeExample.java
 */

public class FinalizeExample {
	public static void main(String[] args) throws InterruptedException {
		
		Test t1 = new Test();
		t1 = null;
		
		Thread.sleep(1000);
		System.out.println("Middle of main");
		
		System.gc();
		System.out.println("gc() called");
		
		System.out.println("End of main");
	}
}

class Test {
	/* Finalize might be called when the Garbage 
	 * Collector runs, not when the object is eligible
	 * for collection. */
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("In finalize");
	}
}
/** OUTPUT
 * Middle of main
 * gc() called
 * End of main
 * In finalize
 */