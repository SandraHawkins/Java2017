/** 
 * Author: Sandra Hawkins
 * Date:   28 Aug 2017
 * OCA_Revision/chapter4MethodsAndEncapsulation/LambdaRefresher.java
 */ 

package chapter4MethodsAndEncapsulation;

import java.util.ArrayList;
import java.util.List;

public class LambdaRefresher {

	public static void main(String[] args) {

		List<Mammal> animalsList = new ArrayList<Mammal>(); 
		
		animalsList.add(new Mammal("fish", false, true));
		animalsList.add(new Mammal("kangaroo", true, false));
		animalsList.add(new Mammal("rabbit", true, false));
		animalsList.add(new Mammal("turtle", false, true));
		
		animalsList.removeIf( (Mammal a) -> { 
								boolean canHop = a.canHop(); 
								return canHop;
							}  ); 
		
		/* When you are calling a method (print method) and one of 
		 * the parameters is an interface, and that interface contains 
		 * one method, you need an instance of a class that implements 
		 * that interface and overrides that one method. 
		 * A interface with one abstract method is call a functional 
		 * interface. When you need to implement a functional interface,
		 * you can use a lambda expression. It will implement the 
		 * method from the interface but without the method name or
		 * visibility modifier or the return type. 
		 * 
		 * 			(parameter list) -> { method's body } 
		 **/
		
		//print(animalsList, (Mammal a) -> { return a.canHop(); } );
		print(animalsList, a -> {return a.getSpecies().length() <= 4;} );
		
		print(animalsList, (Mammal a) -> 
					{
						int nameLength = a.getSpecies().length();
						if (nameLength <= 4)
							return true;
						else 
							return false;
					} );
	}

	private static void print(List<Mammal> animals, CheckTrait checker) {
		for (Mammal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

interface CheckTrait {
	boolean test(Mammal a);
}


class Mammal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Mammal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String getSpecies() { return species; }
	public String toString() { return species; }
}