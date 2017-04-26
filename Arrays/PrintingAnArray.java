public class PrintingAnArray {

	public static void main(String [] args) {
		
		/* The following line sets up a double array with four 
		elements and populates it with the values below. */
		double [] prices = {12.50, 4.99, 2.56, 1.99};
		
		/* You can on the RHS put in 'new double []' but it is not
		needed as the compiler can work out the data type by the 
		contents and the fact that it's an array by the {} and
		the size by the number of values. */
		double [] morePrices = new double [] {12.50, 4.99, 2.56, 1.99};
		
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
	}
}
/** OUTPUT
12.5
4.99
2.56
1.99
*/