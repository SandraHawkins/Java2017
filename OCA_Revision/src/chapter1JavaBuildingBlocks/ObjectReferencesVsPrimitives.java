/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/ObjectReferencesVsPrimitives.java
 */ 

package chapter1JavaBuildingBlocks;

public class ObjectReferencesVsPrimitives {

	public static void main(String[] args) {
		/* When I say 		int b = a;  
		 * b will get a copy of the value in b. So a will be 10 and
		 * b will also be 10. If I change a to 12, this will have 
		 * no effect on b. */
		int a = 10;
		/*	   	 a 
		 * 		[10]
		 */
		int b = a;
		/*	   	 a 		  b
		 * 		[10]	[10]
		 */
		a = 12;
		/*	   	 a 		  b
		 * 		[12]	[10]
		 */
		System.out.println("a : " + a);  // 12
		System.out.println("b : " + b);	 // 10
		
		/* Create an instance of Person and make p1 refer to that new
		 * Object, p1's name will be null. All member variables get
		 * assigned default values. */
		Person p1 = new Person();
		p1.name = "Ted"; // Change p1's name to Ted
		/* Declare a new reference variable called p2 that will
		 * refer to a Person object.  Make it refer to the same object
		 * that p1 refers to.  */
		Person p2 = p1;
		/*
		 * 		p1 -->   ( name = "Ted" )    <-- p2
		 */
		System.out.println("p1's name: " + p1.name); 	// Ted
		System.out.println("p2's name: " + p2.name); 	// Ted
		
		/* Change p1's name to Fred. p2 refers to the object, so
		 * p2's name will also change to Fred. */
		p1.name = "Fred";
		/*
		 * 		p1 -->   ( name = "Fred" )    <-- p2
		 */
		System.out.println("p1's name: " + p1.name); 	// Fred
		System.out.println("p2's name: " + p2.name); 	// Fred
		
		/* Only one new Person object was created above and both
		 * p1 and p2 refer to that same object. Whether you use
		 * p1 or p2 to change the contents of the object, the contents
		 * will change for both reference variables/ addresses. */
		
		Person p3 = new Person();
		p3.name = "p3";
		/* 
		 * 	p3 --> ( name = "p3")
		 */
		p3 = p2; // Make p3 refer to the same object as p2
		//  
		
		/* When p3 is reassigned to refer to the object that p2 refers
		 * to, the object with name="p3" is no longer accessible and
		 * becomes eligible for garbage collection as it can no longer
		 * be accessed */
		
		/*
		 * 
		 * 		p1 -->   ( name = "Fred" )    <-- p2
		 * 	             				^
		 * 								 \       Garbage Collect please
		 * 		   					 	  \ p3   ( name = "p3")
		 */
		p3.name = "Mary";
		/*
		 * 
		 * 		p1 -->   ( name = "Mary" )    <-- p2
		 * 	             				^
		 * 								 \       
		 * 		   					 	  \ p3
		 */
		System.out.println(p2.name);  // Mary
		
		Person p4 = new Person();
		p4.name = "Mary";
		/*  p4 -->  ( name = "Mary" ) */
	}
}
class Person {
	String name;
}