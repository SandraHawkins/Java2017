/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/Circle.java
 */ 
//           Circle IS-A Shape		IS-A  Bounceable object
public class Circle extends Shape implements Bounceable {
	
	private int radius;
	private int bounceFactor;
	
	public Circle(Colour colour, int radius, int bounceFactor) {
		super(colour);
		this.radius = radius;
		setBounceFactor(bounceFactor);
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

	@Override
	public void bounce() {
		System.out.println("Circle is bouncing");
		
	}

	@Override
	public void setBounceFactor(int bounceFactor) {
		if (bounceFactor == SMALL_BOUNCE || 
				bounceFactor == MEDIUM_BOUNCE ||
				bounceFactor == LARGE_BOUNCE) {
			this.bounceFactor = bounceFactor;
		} else {
			System.out.println("Invalid Bounce factor, setting to default");
		
			/* The constants from the Bounceable interface can be accessed
			 * in a static way either through the interface or this class
			 * because they are inherited. */
			this.bounceFactor = Bounceable.MEDIUM_BOUNCE;
					// or
			this.bounceFactor = Circle.MEDIUM_BOUNCE;
					// or
			this.bounceFactor = MEDIUM_BOUNCE;
		}
	}

	@Override
	public int getBounceFactor() {
		
		return bounceFactor;
	}
}
