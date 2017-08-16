/** 
 * Author: Sandra Hawkins
 * Date:   11 Aug 2017
 * OCA_Revision/chapter2SamplesFromBook/Q18.java
 */ 

package chapter2SamplesFromBook;

public class Q18 {

	public static void main(String[] args) {

		int count = 0;  // 0 1 2 
		//  row = 1 2 3 4 
		ROW_LOOP: for(int row = 1; row <=3; row++)
			// col = 1 2.. 1 .. 1 2 
			for(int col = 1; col <=2 ; col++) {
				// 1 * 1 % 2 = 1
				// 1 * 2 % 2 = 0
				// 2 * 1 % 2 = 0 
				// 3 * 1 % 2 = 1
				// 3 * 2 % 2 = 0
				if(row * col % 2 == 0) 
					continue ROW_LOOP;
				count++;
			}
		System.out.println(count); // 2
	}
}