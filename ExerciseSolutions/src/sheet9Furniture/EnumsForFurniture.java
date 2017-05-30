/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/EnumsForFurniture.java
 */ 

package sheet9Furniture;

/*
 * Cannot be public because it would have to be in a file of the same
 * name and this filename is called EnumsForFurniture.java
 * 
 * Cannot be private or protected because a top level class/ enum/ 
 * interface can only be public or default. 
 */

// Used by all subclasses
enum MaterialType { 
	PINE, WALNUT, OAK, PLASTIC, METAL, GLASS, ALUMINIUM, LEATHER
}

// Used in the Table subclass
enum Expandable {
	YES, NO
}

// Used in the Table subclass
enum Shape {
	ROUND, SQUARE, OVAL, RECTANGULAR, COFFEE	
}

// Used in the BedSize subclass
enum BedSize {
	SINGLE, DOUBLE, KING, QUEEN, BUNK
}

//Used in the BedSize subclass
enum Headboard {
	YES, NO
}

// Used in the Chair subclass
enum GasLift {
	YES, NO
}

// Used in the Chair subclass
enum TypeOfChair {
	OFFICE, ARM, STOOL, DINING, LAZY_BOY, SWIZZLE, HIGH, BUBBLE, BAR
}