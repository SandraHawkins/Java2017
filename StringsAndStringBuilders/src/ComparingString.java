/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * StringsAndStringBuilders//ComparingString.java
 */

public class ComparingString {

	public static void main(String[] args) {

		String apple = "apple";
		String carrot = "carrot";
		
		/* Q: Where does apple appear in the alphabet in relation to carrot?
		 * A: It appears 2 characters before carrot, therefore 2 is returned 
		 *    from compareTo(); 
		 *     -2   -1    *  
		 *      a    b    c 
		 */
		System.out.println(apple.compareTo(carrot));  // -2 
		
		/* Q: Where does gate appear in the alphabet in relation to gape?
		 *    'g' and 'a' are ignored, so the question is: where does t 
		 *    appear in relation to 'p'?
		 *   
		 * A: 't' appears 4 places after 'p' in the alphabet, so 4 is returned
		 *    from compareTo()
		 * 
		 *      *  1  2  3  4   
		 *      p  q  r  s  t 
		 */
		System.out.println("gate".compareTo("gape")); // 4
	}
}