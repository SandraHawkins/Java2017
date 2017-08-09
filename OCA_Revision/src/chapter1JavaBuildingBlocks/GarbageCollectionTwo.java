/** 
 * Author: Sandra Hawkins
 * Date:   3 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/GarbageCollectionTwo.java
 */ 

package chapter1JavaBuildingBlocks;

public class GarbageCollectionTwo {

	public static void main(String[] args) {

		Car c1 = new Car("VW", "Polo", 1.4);
		c1.setMake(null); // "Polo" eligible for GC
		Car c2 = c1;
		c2 = null;
		c1 = null;		// Now the whole VW car is eligible for GC
		
		/* Creates an instance of this class, so that the makeACar()
		 * method can be called. */
		GarbageCollectionTwo gc2 = new GarbageCollectionTwo();
		gc2.makeACar();
		
		/* On the RHS of the =, returnACar() method is called, it
		 * creates a car object and returns the address of that
		 * car.  So, c5 refers to the car object created in the 
		 * method. 
		 * 
		 *  		make = "Opel"
		 * 	     	model = "Corsa"     <-- c5
		 * 			engineSize = 1.0
		 */
		Car c5 = gc2.returnACar();
		c5.setModel("Astra");
		/*
		 *  		make = "Opel"
		 * 	     	model = "Astra"     <-- c5
		 * 			engineSize = 1.0						*/		
		c5 = null;
		/*
		 *  		make = "Opel"
		 * 	     	model = "Astra"     		c5 --> null
		 * 			engineSize = 1.0						*/
	}	
	public Car returnACar() {
		Car c4 = new Car("Opel", "Corsa", 1.0);
		/* 
		 * 			make = "Opel"
		 * c4 --> 	model = "Corsa"
		 * 			engineSize = 1.0
		 */
		return c4;  // the memory address of the Opel Corsa is returned.
	}
	
	void makeACar() {
		/* The object on the next line can only be seen inside 
		 * this method. */
		Car c3 = new Car("Ford", "Focus", 1.6);
		
	} /* When this methods finishes, the Car object and "Ford" and
	"Focus" will all become eligible for garbage collection. */
	
	
}

class Car {
	private String make;
	private String model;
	private double engineSize;

	public Car(String make, String model, double engineSize) {
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
}
