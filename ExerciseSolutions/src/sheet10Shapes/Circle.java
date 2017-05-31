/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/Circle.java
 */ 

package sheet10Shapes;
//           Circle IS-A Shape
public class Circle extends Shape {
	
	private int radius;
	
	public Circle(Colour colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.printf("Drawing a %s Circle\n", getColour());
	}
	
	public String toString() {
		return "Circle: "  + super.toString() +
				", radius = " + radius;
	}
}
