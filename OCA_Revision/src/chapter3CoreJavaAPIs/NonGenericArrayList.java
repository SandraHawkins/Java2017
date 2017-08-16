/** 
 * Author: Sandra Hawkins
 * Date:   16 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/NonGenericArrayList.java
 */ 

package chapter3CoreJavaAPIs;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {

		ArrayList listOfAnything = new ArrayList();
		listOfAnything.add("Hello");
		listOfAnything.add(3);
		listOfAnything.add(new Cat());
		System.out.println(listOfAnything); 
		// [Hello, 3, *Cat object*]
		
		/* If I created the list using generics, e.g. ArrayList<String>
		 * and I called listOfAnything.get(2) will return a String,
		 * when you don't use generics, like this example, when
		 * you get from list, you will get an Object type back. 
		 **/
		Object anything = listOfAnything.get(2);
	}
}
