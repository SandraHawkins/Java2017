/* 
 * You must know the variable sizes in relation to each other 
 * (i.e. smallest to largest)
 *
 * Data type		Size in bytes
 * 
 *  byte			 1 byte
 *  short			 2 bytes
 *  int				 4 bytes
 *  long			 8 bytes
 * 
 *  float			 4 bytes
 *  double 			 8 bytes
 *
 * Widening is when you assign a smaller type into a larger container,
 * which is okay to do and will be done automatically. 
 * Narrowing is when you assign a bigger data type into a small 
 * container. Your code will not compile and you will need to insert
 * an explicit cast, see an example below.
 */

public class WideningAndNarrowing {

	public static void main(String [] args) {
		/* You can put a smaller type into a bigger container 
		   without any problems, this is known as widening, e.g.: */
		int aShort = 23;
		int anInt = aShort;
		
		/* This is okay too */
		int num1 = 10;
		long num2 = num1;
		
		/* You cannot put a larger type into a smaller container.
           This is know as narrowing and you must use a cast.
           To cast a variable you put the (data type) in brackets
           that you want to convert to, e.g.:  */
		double largePrice = 1295.66;
		//float smallerSize = largePrice;  // This will not compile.
		
		/* And to fix the previous line of code: */
		float smallerSize = (float)largePrice + 12;
	}
}