public class Ex3AverageAndTotal {

	/*
		Each method has its own area of memory. Any variables 
		declared in the parameter list i.e.(String [] args) or inside
		the method, i.e. a, b and c are only visible to that method
		and not to any other methods in the class.
		Also, you cannot access a variable declared on the next line.
		e.g.
		                                         //*** won't compile
		System.out.println("The average is : " + average);
		double average = (num1 + num2 + num3) / 3;  
	*/
	public static void main(String [] args) {
		
		Ex3AverageAndTotal ex3 = new Ex3AverageAndTotal();
		double a = 1.2;
		double b = 2.2;
		int c = 5;
		ex3.getAverage(a, b, c);
		ex3.getTotal(a, b, 9);
	}
	
	/*
		This method can only be access from within another method
		in this class.
	*/
	private void getTotal(double num1, double num2, int num3) {
		double total;
		total = num1 + num2 + num3;
		System.out.println("The total is " + total);
	}
	
	/*
		double num1, double num2, int num3
		These are variable declarations also (called parameters), that 
		will hold the value of the inputs (called arguments). Each 
		method has its own area of memory, therefore three variables
		will be declared in memory. 
	*/	//                        1.2          2.2       5
	public void getAverage(double num1, double num2, int num3) {
		
		double average = (num1 + num2 + num3) / 3;
		System.out.printf("The average is : %.2f\n", average);
	}		
}
/*** OUTPUT
The average is : 2.80
The total is 12.4
*/