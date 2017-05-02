package sheet2Methods;

/*
	If you want a method to return a value you must do three things:
	
	1. The method cannot be void and must be the correct data type
	   you want to return, e.g. public ***double*** calculateVolume(....)
	2. Insert a return statement into the method.
	   e.g. return volume.
	   The return statement must be the end of the method.
	3. Assign the returned value from the method to a variable, and
	   do something with it, e.g. print it out. 
	   e.g.: 
			double answer = ex4.calculateVolume(depth, width, breadth);
			System.out.println("Result from method: " + answer);
		
*/
public class Ex4CalcVolumeWithReturnValue {

	public static void main(String [] xxx) {
	
		Ex4CalcVolumeWithReturnValue ex4 = new Ex4CalcVolumeWithReturnValue();
		double depth = 10;
		double width = 12.5;
		double breadth = 22.1;
		double answer = ex4.calculateVolume(depth, width, breadth);
		System.out.println("Result from method: " + answer);
	}

	public double calculateVolume(
				double depth, double width, double breadth) {
	
		double volume = depth * width * breadth;
		return volume;
	}
}