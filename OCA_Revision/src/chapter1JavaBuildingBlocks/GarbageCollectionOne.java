/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/GarbageCollectionOne.java
 */ 

package chapter1JavaBuildingBlocks;

/*
 * An object becomes eligible for garbage collection when it can no
 * longer be reached by a reference variable. 
 * 
 * The JVM will reclaim memory from inaccessible object when 
 * it feels like it. 
 * 
 * You can ask the JVM to run it garbage collector: 
 * 
 * 		System.gc();
 *   
 * and it might run.
 * 
 * ***** Only objects can be garbage collected ******
 * References can be reused to refer to other object or refer
 * to null. 
 * 
 * Several references can refer to one object in memory. Only when
 * the object cannot be reached by any of those references can the
 * object be garbage collected. 
 * 
 * 			s1 -->   "Hello"   <-- s2
 *                    ^
 * 					 /
 * 			     s3 /   
 * 
 * When can "Hello" be garbage collected?
 * s1 = null; 
 * s2 = new StringBuilder("Goodbye");
 * s3 = s1;  // s3 = null;
 * 
 * Answer: after s3 is set to null, then "Hello" will no longer
 * be referene by any reference variables.
 */
public class GarbageCollectionOne {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");
		/*
		 * sb --> ( "hello" )
		 */
		// I can dereference by "Hello" StringBuilder as follows:
		
		sb = new StringBuilder("Hello is gone!!!!");

		/*
		 * 		  ( "hello" )  // Eligible for GC
		 * 
		 * sb --> ( "Hello is gone!!!!" )
		 *
		 */
		
		sb = null;
		 /* 
		 * 		 ( "Hello is gone!!!!" )  // Eligible for GC
		 * 
		 * sb --> null		// null means no object
		 */
		
		StringBuilder sb1 = new StringBuilder("sb1");
		StringBuilder sb2 = new StringBuilder("sb2");
		/*
		 * sb1 --> ( sb1 )
		 * sb2 --> ( sb2 )
		 */
		sb1 = sb2; // Make sb1 refer to the same object as sb2,
		// therefore it no longer refers to ("sb1") object and
		// it will become eligible for GC.
				
		/*
		 * 			( sb1 )  // Eligible for GC
		 *
		 * sb1 \
		 *      \
		 * sb2 --> ( sb2 )
		 */
	} // ( sb2 ) is now eligible for GC when main() finishes.
}
