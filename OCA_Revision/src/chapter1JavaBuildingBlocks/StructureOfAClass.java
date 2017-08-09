/** 
 * Author: Sandra Hawkins

 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/StructureOfAClass.java
 */ 

/* Page 34 for all rules.  */
/* package optional, must be first */
package chapter1JavaBuildingBlocks;

/* imports optional, must be after package */
import java.*; // nothing is achieved by this
import java.sql.Date;
//import java.util.Date; // won't compile as you cannot import 
// two Date classes

/* You automatically get an import for the java.lang package. */
/* This asks to use all classes in the java.util package. */
//import java.util.*;
import java.util.Scanner;

/* must be after package and imports. */
public class StructureOfAClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* Without an import, I would have to write the full name
		 * of the class as follows: */
		java.util.ArrayList<String> myList = new java.util.ArrayList<>();
		
		Date date;
	}
}