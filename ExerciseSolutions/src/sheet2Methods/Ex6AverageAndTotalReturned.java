package sheet2Methods;

public class Ex6AverageAndTotalReturned {

	public static void main(String [] args) {
		
		Ex6AverageAndTotalReturned ex6 = new Ex6AverageAndTotalReturned() ;
		//      12.6
		double result = ex6.getAverage(2.2, 4.4, 6);
		System.out.println("The average is " + result);
		
		/* I cannot declare result again, e.g. the following code
			won't compile:
			double result = ......; 
		If I take away the declaration i.e. remove 'double' then
		the following line is fine and the returned value from
		the getTotal method will be stored in the result variable and
		the previous value/ the average will be overwritten. */
		result = ex6.getTotal(2.2, 4.4, 6);
		System.out.println("The total is " + result);
	}
	
	//							  2.2		  4.4		 6
	public double getTotal(double num1, double num2, int num3) {
		double total = num1 + num2 + num3;  // 12.6
		return total;  // 12.6
	}
	
	//								2.2			4.4			6
	public double getAverage(double num1, double num2, int num3) {
		double average = (num1 + num2 + num3) / 3;  // 4.2
		return average;  // 4.2
	}
}