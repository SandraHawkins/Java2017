public class Ex9TemperatureConversion {

	public static void main(String [] args) {
		Ex9TemperatureConversion ex9 = new Ex9TemperatureConversion();
		double fah = 90;
		double cel = 32.22;
		ex9.fahrenToCel(fah);
		ex9.celToFahren(cel);
	}
	
	public void celToFahren(double cel) {
		double fah = (9 / 5.0 * cel) + 32;
		System.out.printf("%.2f in Celsius is %.2f in Fahrenheit\n", 
					      cel, fah);
	}
	
	public void fahrenToCel(double fah) {
		/* fah - 32 happens first: 90.0 - 32 = 58.0.  Then 58.0 will
		be multiplied by 5. NOTE: a double multiplied by an int will
		give a double result. */                 
		double celsius = (fah - 32) * 5 / 9;
		
		/* fah - 32 happens first: 90.0 - 32 = 58.0. Then 5 / 9 
			happens next and int dividied by an int will give an int
			result, therefore the following line won't give the 
			correct result. To fix it, make 5 or 9 a double, e.g.
			5.0, 5d, 5f. */
		//double celsius = 5 / 9 * (fah - 32);
		System.out.printf("%.2f in Fahrenheit is %.2f in Celsius\n", 
					      fah, celsius);
	}
}
/*** OUTPUT
90.00 in Fahrenheit is 32.22 in Celsius
32.22 in Celsius is 90.00 in Fahrenheit
*/