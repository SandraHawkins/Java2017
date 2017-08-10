package chapter2OperatorsAndStatements;

public class Ternary {

	public static void main(String[] args) {
		
		int x = 91;
		
		double profit = (x >= 80 && x <= 90)? 0.2: x > 90? 0.5: 0;
		
		System.out.println(profit);

	}

}
