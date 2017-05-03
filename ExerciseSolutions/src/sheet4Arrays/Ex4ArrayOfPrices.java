package sheet4Arrays;

public class Ex4ArrayOfPrices {

	public static void main(String[] args) {
		double [] prices = {12.5, 2.99, 1.46, 1.95, 10.40, 2.33,
				            5, 8.99, 1.54, 2.49, 6.5, 4};
		
		double [] newPrices = new double[prices.length];
		
		/* This loop is used to populate the newPrices array
		 * with the old price + 4%. */
		for (int i = 0; i < prices.length; i++) {
			newPrices[i] = prices[i] * 1.04;
		}
		
		/* This loop is used to print both the old and new
		 * prices side by side 
		 * %	means special characters follow
		 * - 	left justify
		 * 10	column width of 10
		 * .2	2 decimal places
		 * s	String argument
		 * d 	int argument
		 * */
		System.out.printf("%-10s%10s\n", "Old Price", "New Price");
		for (int i = 0; i < prices.length; i++) {
			System.out.printf("%-10.2f %-10.2f\n", 
							  prices[i], newPrices[i]);
		}
		
		/* To call a method in another class, create an instance
		 * of the other call, e.g. ex3 and use it to call 
		 * the method.
		 * */
		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		ex3.printMyArray(prices);
		ex3.printMyArray(newPrices);
	}
}



