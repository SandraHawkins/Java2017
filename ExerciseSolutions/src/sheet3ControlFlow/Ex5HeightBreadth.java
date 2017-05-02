package sheet3ControlFlow;

class Ex5HeightBreadth {

	public static void main(String [] args) {
		double height = 6;
		double length = 5;
		Ex5HeightBreadth ex5 = new Ex5HeightBreadth();
		ex5.calculateAreaAndPerimeter(height, length);
	}	
	
	private void calculateAreaAndPerimeter(double height, double length) {
		double area;
		double perimeter;
		
		area = height * length;
		perimeter = 2 * height + 2 * length;
		
		if (height == length) {
			System.out.printf("Area of the square is %.2f and " +
							  "perimeter is %.2f", area, perimeter);
		} else {
			System.out.printf("Area of the rectangle is %.2f and " +
							  "perimeter is %.2f", area, perimeter);
		}
	}
}