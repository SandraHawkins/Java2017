package sheet2Methods;

public class Ex2CalculatePriceWithReturnValue {

	public static void main(String [] anyStrings) {
		double price = 2.99;
		int quantity = 5;
		
		Ex2CalculatePriceWithReturnValue ex2 = 
					new Ex2CalculatePriceWithReturnValue();
		// double result = 14.95;
		double result = ex2.calculatePrice(price, quantity);
		System.out.printf("The total price: %.2f\n", result);
		
		// 	afterVAT = 18.39  					     14.95
		double afterVAT = ex2.calculateTotalAfterVAT(result);
		System.out.printf("The total after VAT: %.2f\n", afterVAT);
		
		/*
		I can call a public method in another class but not a 
		private method.
		*/
		Ex3AverageAndTotal ex3 = new Ex3AverageAndTotal();
		ex3.getAverage(1, 1, 1);
	}

	//									2.99			5
	private double calculatePrice(double price, int quantity) {
		double total;
		total = price * quantity;  // total = 2.99 * 5
		//System.out.printf("The total of %.2f times %d is %.2f", 
		//			      price, quantity, total);	
		return total;  // 14.95
		//return total; // must be the last line in a method 
	}
		//										  14.95
	private double calculateTotalAfterVAT(double total) {
		return total * 1.23; // 18.39
	}
	
}
/***** OUTPUT
The total price: 14.95
The total after VAT: 18.39
*/