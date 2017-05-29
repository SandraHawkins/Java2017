/** 
 * Author: Sandra Hawkins
 * Date:   29 May 2017
 * ExerciseSolutions/sheet9Inheritance/MainForFurniture.java
 */ 

package sheet9Inheritance;

import sheet9Inheritance.Furniture.Colour;

class MainForFurniture {

	public static void main(String[] args) {

		/*  
		 * The following line will not compile, I cannot create an 
		 * instance of Furniture because it is an abstract class. 
		 */
		// Furniture f1 = new Furniture(Colour.GREEN, MaterialType.OAK);
		
		Table t1 = new Table();
		t1.setColour(Colour.BLACK); // import required for this enum
		// because it is nested in the Furniture class.
		t1.setMaterialType(MaterialType.ALUMINIUM);
		
		Table t2 = new Table(Colour.BLUE, MaterialType.PLASTIC, 
					         Expandable.NO, Shape.COFFEE);
		System.out.println(t2);
		
		Bed b1 = new Bed(Colour.RED, MaterialType.PINE, 
						 BedSize.KING, Headboard.YES);
		System.out.println(b1);
		
		Chair c1 = new Chair(Colour.BROWN, MaterialType.LEATHER, 
				             GasLift.YES, TypeOfChair.LAZY_BOY);
		System.out.println(c1);
			
		/* Counter: */
		System.out.println("Counter : " + Furniture.counter);
			
		System.out.println("\nFurniture colours: ");
		
		/* When the array contains child objects, the reference type
		 * of the array must be the parent class */
		Furniture [] allPieces = {t1, t2, c1, b1, 
				new Table(Colour.RED, MaterialType.METAL, 
						  Expandable.YES, Shape.SQUARE)};
		
		/* This loop will print the colour of each piece of Furniture.
		 * getColour exists in the Furniture class and therefore all child
		 * object will inherit getColour().
		 * 
		 * When you use the enhanced for loop to iterate though an array
		 * of Furniture objects, the right hand side of the colon must be
		 * the parent type, i.e Furniture.
		 * 
		 * Inside the for loop, when you type one.  you will only get
		 * access to methods from the Furniture class (and those inherited
		 * from the Object class).
		 * */
		for (Furniture one : allPieces) {
			System.out.println("Colour : " + one.getColour()); // you could 
			// call toString() and toLowerCase() on this if you want
		}
		
		System.out.println("\nTable shapes: ");
		
		/*
		 * If you want to access a child's method when looping through the
		 * array, e.g. you want to print out the shape of each table in
		 * the loop. You will need to downcast 'one' which is a Furniture
		 * type into the correct child type. Again, if you type one.  you 
		 * will only get access to the methods in the Furniture class.  
		 * You can downcast from a parent reference into a child reference:
		 *  			(Table)one
		 * Before you do this, you should check if the reference 'one' refers 
		 * to a Table object, if it doesn't and you downcast (e.g. 'one'
		 * refers to a Chair and you downcast 'one' into a Table reference),
		 * you will get a ClassCastException at runtime. Therefore you should
		 * insert if (reference instanceof Class) before peforming a downcast.
		 * 
		 * The extra brackets are needed around the cast, because the method
		 * call one.getShape() has higher precedece over the cast and you 
		 * want to make sure the cast happens first: 
		 * 
		 * 			((Table)one).getShape()
		 *          ^          ^
		 */
		for (Furniture one : allPieces) {
			// If the current shape in the array is a table, then
			// get the shape of it.
			if (one instanceof Table) {
				System.out.println("Table size: " + ((Table)one).getShape() );
			}
		} 
	}
}
/** OUTPUT
 ----- Table -----
Colour = blue
MaterialType = plastic
Table isExpandable = no
Shape = coffee

----- Bed -----
Colour = red
MaterialType = pine
BedSize = king
Has a headboard = yes

----- Chair ----- 
Colour = brown
MaterialType = leather
GasLift = yes
TypeOfChair = lazy boy
Counter : 4

Furniture colours: 
Colour : BLACK
Colour : BLUE
Colour : BROWN
Colour : RED
Colour : RED

Table shapes: 
Table size: null
Table size: COFFEE
Table size: SQUARE
*/
