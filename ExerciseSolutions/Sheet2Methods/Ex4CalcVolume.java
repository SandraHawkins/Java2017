public class Ex4CalcVolume {

	public static void main(String [] xxx) {
	
		Ex4CalcVolume ex4 = new Ex4CalcVolume();
		double depth = 10;
		double width = 12.5;
		double breadth = 22.1;
		ex4.calculateVolume(depth, width, breadth);
	}

	public void calculateVolume(
				double depth, double width, double breadth) {
	
		double volume = depth * width * breadth;
		
		System.out.println("The volume is " + volume);
	}
}