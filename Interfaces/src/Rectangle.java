/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * ExerciseSolutions/sheet10Shapes/Rectangle.java
 */ 

public class Rectangle extends Shape {

	private int height;
	private int width;
	private int area;
	
	public Rectangle(Colour colour, int height, int width) {
		super(colour);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void draw() {
		System.out.printf("Drawing a %d * %d %s Rectangle\n", 
				          height, width, getColour());
	}
	
	public int getArea() {
		return area = height * width;
	}
	
	@Override
	public String toString() {
		return "Rectangle: "  + super.toString() +
				", height = " + height + 
				", width = " + width +
				", area = " + getArea() + " cm2";
	}
}
