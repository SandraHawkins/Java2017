/** 
 * Author: Sandra Hawkins
 * Date:   26 May 2017
 * Inheritance//MainForParentChild.java
 */

public class MainForParentChild {

	public static void main(String[] args) {

		/*
		 * 	p --> name = "Pat Murphy"
		 */
		Parent p = new Parent("Pat Murphy");
		System.out.println(p);   // Name : Pat Murphy
		 
		/* 
		 * 	c --> name = Stephen
		 *        schoolAddress =  null
		 * 	
		 */
		Child c = new Child();
		c.setName("Stephen");
		System.out.println(c);  // Name : Stephen
		
		Child c2 = new Child("Mary", "Finglas");
		System.out.println(c2);
		
		
		System.out.println("Number of person objects: " + 
						Parent.personCounter);
		
		Parent [] all = {p, c};
	}
}