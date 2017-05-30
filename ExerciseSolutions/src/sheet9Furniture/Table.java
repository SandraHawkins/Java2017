/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/Table.java
 */ 

package sheet9Furniture;

public class Table extends Furniture {
	
	/* Member variables */
	private Expandable isExpandable;
	private Shape shape;
	
	public Table() {
		// super();
	}
	
	public Table(Colour colour, MaterialType materialType,  
			     Expandable isExpandable, Shape shape) {
		// Call the constructor in Furniture that takes the colour and
		// materialType parameters
		super(colour, materialType);
		
		this.isExpandable = isExpandable;
		this.shape = shape;
		//setIsExpandable(isExpandable);
		//setShape(shape);
	}

	/**
	 * @return the isExpandable
	 */
	public Expandable getIsExpandable() {
		return isExpandable;
	}

	/**
	 * @param isExpandable the isExpandable to set
	 */
	public void setIsExpandable(Expandable isExpandable) {
		this.isExpandable = isExpandable;
	}

	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "----- Table -----" + super.toString() + 
				"\nTable isExpandable = " + isExpandable.toString().toLowerCase() + 
				"\nShape = " + shape.toString().toLowerCase();
	}
}
