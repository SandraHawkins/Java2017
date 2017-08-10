/** 
 * Author: Sandra Hawkins
 * Date:   9 Aug 2017
 * OCA_Revision/chapter2OperatorsAndStatements/IfStatementSimple.java
 */ 

package chapter2OperatorsAndStatements;

public class IfStatementSimple {

	public static void main(String[] args) {

		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colourWaveLength = 1.630;
		
		if (weight >= 500) {
			animal = "elephant ";
		}
		
		if (colourWaveLength > 1.621) {
			animal = "grey " + animal;
		}
		
		if (sex <= 'f') { // a = 97, b = 98, c = 99
			animal = "female " + animal;
		}
		
		System.out.println("The animal is a " + animal);
	}
}
/*
 * OUTPUT: The animal is a grey elephant 
 */