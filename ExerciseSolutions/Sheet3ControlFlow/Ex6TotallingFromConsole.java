public class Ex6TotallingFromConsole {

	public static void main(String [] args) {
		/* For a running total
			1. Declare a variable BEFORE the loop to hold the total
			   and initialise it to 0.
			2. Add to the total variable inside the loop.
			3. Print the total after the loop
		*/
		
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
		
			System.out.println("i is " + i);
			
			total = total + i; 
			//total += i;
		}
		System.out.println("The total after the loop is: " + total);
	}
}