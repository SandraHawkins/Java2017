/** 
 * Author: Sandra Hawkins
 * Date:   15 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex3UpdateMenuUsingStringBuilder.java
 * 
 * todaysMenu = “Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.”
a)	Using method from the string class, change ‘Wednesday’ to ‘Thursday’. 
Print the new string.
b)	Change ‘turkey’ to ‘beef’ and print the new string.
c)	Now add the following to the end of the menu: “Jelly and ice 
cream for dessert”.
d)	The ice cream is all gone, so the end of the string should now read: 
Jelly for dessert.
 */ 

package sheet16StringsAndStringBuilder;

public class Ex3UpdateMenuUsingStringBuilder {

	public static void main(String[] args) {

		StringBuilder todaysMenu = new StringBuilder(
				"Menu: Wednesday’s Menu: Roast turkey with homemade turkey "
						+ "gravy, potatoes and veg of the day.");
		
		/*** Insert a newline just before potatoes ***/
		todaysMenu.insert(todaysMenu.indexOf("potatoes"), "\n");
		
		/*** Replace Wednesday with Thursday ***/
		int index = 0;
		// Find the first occurrence of Wednesday
		int found = todaysMenu.indexOf("Wednesday");
		
		// While it was found. indexOf() will return -1 when not found
		while (found != -1) {
			int end = found + "Wednesday".length();
			todaysMenu.replace(found, end, "Thursday");
			// Start searching again at the end of the previous find + 1
			index = end + 1;
			// Search again for Wednesday at the next index
			found = todaysMenu.indexOf("Wednesday", index);
		} 
		System.out.println(todaysMenu);
		// Menu: Thursday’s Menu: Roast turkey with homemade turkey gravy, Thursday 
		//   potatoes and veg of the day.
		
		/*** Replace turkey with beef ***/
		// todaysMenu.indexOf("turkey") is the start position of 'turkey'
//		int startOfTurkey = todaysMenu.indexOf("turkey");
//		//                 start position,   end position,  
//		todaysMenu.replace(startOfTurkey, startOfTurkey + "turkey".length(), 
//				           "beef"); // what to replace it with
		
		// Convert the SB into a String and call the String's replace method
		// You can use replace() or replaceAll(). replaceAll() allows you
		// to search for a String using regular expression.
		String menu = todaysMenu.toString().replace("turkey", "beef");
		// Convert the String back into a StringBuilder
		todaysMenu = new StringBuilder(menu);
		System.out.println(todaysMenu);
		// Menu: Thursday’s Menu: Roast beef with homemade beef gravy, 
		// potatoes and veg of the day.

		todaysMenu.append(" Jelly and ice cream for dessert.");
		System.out.println(todaysMenu);
		// Menu: Thursday’s Menu: Roast beef with homemade beef gravy, 
		// potatoes and veg of the day. Jelly and ice cream for dessert.
		
		System.out.println("******");
		//todaysMenu.replace(todaysMenu.indexOf("and ice cream"), 
		//		todaysMenu.indexOf("for"), "");
		System.out.println(todaysMenu.delete(
				todaysMenu.indexOf("and ice cream"), // start	
				todaysMenu.indexOf("for")));		 // end
		// Menu: Thursday’s Menu: Roast beef with homemade beef gravy, 
		// potatoes and veg of the day. Jelly for dessert.
	}
}