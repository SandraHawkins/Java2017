/** 
 * Author: Sandra Hawkins
 * Date:   18 Aug 2017
 * OCA_Revision/chapter3CoreJavaAPIs/CopyOfArrayList.java
 */ 

package chapter3CoreJavaAPIs;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class CopyOfArrayList {

	public static void main(String[] args) {
		ArrayList<StringBuilder> listOfStrings = new ArrayList<>();
		listOfStrings.add(new StringBuilder("One"));
		listOfStrings.add(new StringBuilder("Two"));
		listOfStrings.add(new StringBuilder("Three"));
		listOfStrings.add(new StringBuilder("Four"));
		
		/*
		 * 	listOfStrings --> []    []      []     []
		 *                     |     |       |      |
		 * 					[One] [TwoXXX] [Three] [Four]	
		 *                     |     |       |      |
		 *    copyOf      --> []    []       []     []
		 * 
		 */
	
		ArrayList<StringBuilder> copyOf = new ArrayList<>(listOfStrings);
		copyOf.get(1).append("XXX");
		System.out.println(listOfStrings);  //[One, TwoXXX, Three, Four]
		System.out.println(copyOf); 		// [One, TwoXXX, Three, Four]
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		.SHORT);
		System.out.println(f.format(d));
	}
}
