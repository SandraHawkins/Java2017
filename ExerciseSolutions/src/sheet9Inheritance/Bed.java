/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/Bed.java
 */ 

package sheet9Inheritance;

public class Bed extends Furniture {
	
	private BedSize bedSize;
	private Headboard hasHeadboard;
	
	public static int bedCounter;
	
	public Bed() {	
		//super();
		bedCounter++;
	}	

	public Bed(Colour colour, MaterialType materialType, 
			   BedSize bedSize, Headboard hasHeadboard) {
		//super(colour, materialType);
		//bedCounter++;
		
			// 2 lines from above or 3 lines underneath
		
		this();
		setColour(colour);
		setMaterialType(materialType);
		
		this.bedSize = bedSize;
		this.hasHeadboard = hasHeadboard;
	}

	/**
	 * @return the bedSize
	 */
	public BedSize getBedSize() {
		return bedSize;
	}

	/**
	 * @param bedSize the bedSize to set
	 */
	public void setBedSize(BedSize bedSize) {
		this.bedSize = bedSize;
	}

	/**
	 * @return the hasHeadboard
	 */
	public Headboard getHasHeadboard() {
		return hasHeadboard;
	}

	/**
	 * @param hasHeadboard the hasHeadboard to set
	 */
	public void setHasHeadboard(Headboard hasHeadboard) {
		this.hasHeadboard = hasHeadboard;
	}
	
	@Override
	public String toString() {
		return "\n----- Bed -----" + super.toString() +
			   "\nBedSize = " + bedSize.toString().toLowerCase() + 
			   "\nHas a headboard = " + hasHeadboard.toString().toLowerCase();
	}	
}
