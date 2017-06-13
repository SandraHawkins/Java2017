/** 
 * Author: Sandra Hawkins
 * Date:   13 Jun 2017
 * ExerciseSolutions/sheet16StringsAndStringBuilder/Ex2UpdateTheMenu.java
 */ 

package sheet16StringsAndStringBuilder;

public class Ex2UpdateTheMenu {

	public static void main(String[] args) {
		
		String todaysMenu = "Wednesday’s Menu: Roast turkey with "
				+ "homemade turkey gravy, potatoes and veg of the day.";
		
		todaysMenu = todaysMenu.replace("Wednes", "Thurs");
		System.out.println(todaysMenu);
		todaysMenu = todaysMenu.replace("turkey", "beef");
		System.out.println(todaysMenu);
		
		todaysMenu = todaysMenu.concat(" Jelly and ice cream for dessert.");
		System.out.println(todaysMenu);
		
		//todaysMenu = todaysMenu.replace(" and ice cream", "");
		//                                starting index
		todaysMenu = todaysMenu.substring(0, 
				// ending index (at the position where "and ice cream" is	 
				todaysMenu.indexOf(" and ice cream")) + " for dessert.";
		System.out.println(todaysMenu);

	}
}
/** OUTPUT
Thursday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.
Thursday’s Menu: Roast beef with homemade beef gravy, potatoes and veg of the day.
Thursday’s Menu: Roast beef with homemade beef gravy, potatoes and veg of the day. Jelly and ice cream for dessert.
Thursday’s Menu: Roast beef with homemade beef gravy, potatoes and veg of the day. Jelly for dessert.
*/

