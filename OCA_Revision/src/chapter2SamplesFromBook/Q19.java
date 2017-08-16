/** 
 * Author: Sandra Hawkins
 * Date:   11 Aug 2017
 * OCA_Revision/chapter2SamplesFromBook/Q19.java
 */ 

package chapter2SamplesFromBook;

public class Q19 {

	public static void main(String[] args) {
		//  m = 8 7 6    n = 3 5 7    x = 11 23 36
		int m = 9, n = 1, x = 0;
		
		while(m > n) {
			m--;
			n += 2;
			x += m + n; //  x = x + m + n;
		}
		System.out.println(x);  // 36
	}
}