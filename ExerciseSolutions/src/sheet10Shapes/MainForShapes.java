/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/MainForShapes.java
 */ 

package sheet10Shapes;

public class MainForShapes {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(Colour.GREEN, 5, 10);
		Circle c1 = new Circle(Colour.PINK, 7);
		Triangle t1 = new Triangle(Colour.GREEN);

		/*
		 * This Shape array can contain any object that pass the "IS-A" 
		 * test, i.e. all object must extend Shape.
		 * Polymorphism means many forms. This Shape array contains many
		 * different types of shapes.
		 * Polymorphism: Parent data type with Child objects.
		 */
		Shape [] shapes = {r1, c1, t1, new Rectangle(Colour.BLACK, 3, 12),
					       new Circle(Colour.INDIGO, 10)};
		
		for (int i = 0; i < shapes.length; i++) {
			//System.out.println(shapes[i]);
			shapes[i].draw();
			
			if (shapes[i] instanceof Circle) {
				System.out.println("The circle's radius " + 
						((Circle)shapes[i]).getRadius());
			}
		}
	}
}