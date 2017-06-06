/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/Triangle.java
 */ 

public class Triangle extends Shape {

	public Triangle(Colour colour) {
		super(colour);
	}
	
	public void draw() {
		System.out.printf("Drawing a %s Triangle\n", getColour());
	}
}
