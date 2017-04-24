class Ex2CalculatePrice {

	public static void main(String [] anyStrings) {
		double price = 2.99;
		int quantity = 5;
		
		Ex2CalculatePrice ex2 = new Ex2CalculatePrice();
		ex2.calculatePrice(price, quantity);
	}

	/* 
	A private method can only be called in the class as the method.
	i.e. this method is being called from main() above which is 
	physically in the same class.
	*/
	private void calculatePrice(double price, int quantity) {
		double total;
		total = price * quantity;
		System.out.printf("The total of %.2f times %d is %.2f", 
					      price, quantity, total);
	}
}