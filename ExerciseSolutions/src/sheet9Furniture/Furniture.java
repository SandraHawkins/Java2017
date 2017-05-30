/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/Furniture.java
 */ 

package sheet9Furniture;

/**
 * This class exists at the top of the hierarchy to provide common 
 * functionality to all child classes. Making a class abstract means
 * it cannot be instantiated (cannot create an instance/ object of it).
 * The following code will not compile:
 * 
 *  		Furniture f1 = new Furniture();   // WON'T COMPILE
 */
public abstract class Furniture {
	
	/* A protected member (enums/ variable / method) can be used only
	 * in the same package and through inheritance i.e. it will be 
	 * inherited by any subclasses of Furniture even if that subclass 
	 * is not in the same package.
	 */
	protected enum Colour { RED, BLUE, GREEN, BLACK, 
		                    GREY, WHITE, YELLOW, BROWN }
	
	/* Static counter, used to count ALL instances of the subclasses. */
	public static int counter;
	
	/* Member variables */
	private Colour colour;
	private MaterialType materialType;
	
	
	public Furniture() {
		counter++;
	}
	
	/**
	 * Constructors are not inherited but this constructor can be called 
	 * by all subclass constructors to set the colour and materialType. 
	 */
	public Furniture(Colour colour, MaterialType materialType) {
		this();
		this.colour = colour;
		this.materialType = materialType;
	}
	
	/**
	 * @return the colour
	 */
	public Colour getColour() {
		return colour;
	}
	/**
	 * @param colour the colour to set
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	/**
	 * @return the materialType
	 */
	public MaterialType getMaterialType() {
		return materialType;
	}
	
	/**
	 * @param materialType the materialType to set
	 */
	public void setMaterialType(MaterialType materialType) {
		this.materialType = materialType;
	}
	
	/**
	 * Returns the member variables. This toString() can be called by 
	 * all subclasses in their toString() method. 
	 */
	@Override
	public String toString() {
		return "\nColour = " + colour.toString().toLowerCase() + ""
				+ "\nMaterialType = " + materialType.toString().toLowerCase();
	}
}
