package sheet2Methods;

public class Ex1AddAndMultiply {

	public static void main(String [] args) {
		Ex1AddAndMultiply ex1 = new Ex1AddAndMultiply();
		int a = 10;
		int b = 12;
		
		ex1.add(a, b);
		ex1.multiply(a, b);
		ex1.divide(20, 7);
		ex1.subtract(a, b);
		ex1.remainder(20, 7);
	}
	
	/*
		The modulus operator give the remainder after integer division.
	*/
	public void remainder(int a, int b) {
		int result = a % b;
		System.out.printf("The remainder of %d %% %d is %d", 
		                  a, b, result );
	}
	
	public void divide(int a, int b) {
		int result = a / b;
		System.out.printf("%d divided by %d is %d\n", a, b, result);
	}
	
	public void multiply(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " multiplied is " +
		                  (num1 * num2));
	}
	
	public void subtract(int a, int b) {
		int result;
		result = a - b;
		System.out.printf("%d minus %d is %d\n", a, b, result);
	}
	
	public void add(int a, int b) {
		int result;
		result = a + b;
		System.out.printf("%d and %d added is %d\n", a, b, result);
	}
}