/** 
 * Author: Sandra Hawkins
 * Date:   10 May 2017
 * ExerciseSolutions/sheet4A2DArrays/Ex3Clock.java
 */ 
package sheet4A2DArrays;

public class Ex3Clock {

	public static void main(String[] args) {
		/* printf()
		 * %	special character for printf() follow
		 * 0	fill the column with zeros in front of the number
		 * 2	the column width
		 * d	integer
		 **/
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.printf("%02d:%02d\n", i, j);
			}
		}
	}
}
