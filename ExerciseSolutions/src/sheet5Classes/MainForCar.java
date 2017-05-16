/** 
 * Author: Sandra Hawkins
 * Date:   16 May 2017
 * ExerciseSolutions/sheet5Classes/MainForCar.java
 */ 
package sheet5Classes;

public class MainForCar {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		/*
		 * 				make = "Ford"
		 * 		c1 -->	model = "Focus"
		 * 				engineSize = 1.4
		 */
		c1.setMake("Ford");
		c1.setModel("Focus");
		c1.setEngineSize(1.4);
		
		System.out.println("Make : " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Engine size: " + c1.getEngineSize());
		
		System.out.println("-------------------------");
		
		Car c2 = new Car("Audi", "A4", 2.0);
		System.out.println(c2);  // c2.toString()
		
		
		System.out.println("Number of car objects created: " + 
							Car.carCounter);
	}
}