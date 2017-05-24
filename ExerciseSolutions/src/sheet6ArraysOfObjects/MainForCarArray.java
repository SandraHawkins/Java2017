/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet6ArraysOfObjects/MainForCarArray.java
 */ 
package sheet6ArraysOfObjects;

import java.util.Random;

import sheet5Classes.Car;

public class MainForCarArray {

	public static void main(String[] args) {
		
		Car c1 = new Car("Opel", "Corsa", 1.1);
		Car c2 = new Car("Volkswagen", "Polo", 1.4);
		Car c3 = new Car("Honda", "Civic", 1.4);
		Car c4 = new Car("Ford", "Mondeo", 1.8);
		
//		Car [] carsArray = new Car [4];
//		carsArray[0] = c1;
//		carsArray[1] = c2;
//		carsArray[2] = new Car();
//		carsArray[3] = new Car("Audi", "A4", 2.0);
		
		Car [] cars = {c1, c2, c3, c4, new Car(), 
				       new Car("Audi", "A4", 2.0)};
		
		cars[4].setMake("Range Rover");
		cars[4].setModel("Sport");
		cars[4].setEngineSize(2.4);
		
		//MainForCarArray m = new MainForCarArray();
		new MainForCarArray().printCars(cars);
		
		int random = new Random().nextInt(10) + 1;
	}
	
	public void printCars(Car [] cars) {
		for (Car car : cars) {
			//System.out.println(car);  // car.toString()
			System.out.println(car.getMake() + " " + car.getModel());
		}
	}
}