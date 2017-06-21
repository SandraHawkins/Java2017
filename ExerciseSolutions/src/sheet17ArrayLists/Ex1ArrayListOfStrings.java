/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet17ArrayLists/Ex1ArrayListOfStrings.java
 */ 

package sheet17ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

public class Ex1ArrayListOfStrings {

	public static void main(String[] args) {

		String [] names = {"Janos", "Ben", "James", "Asen", "Ewelina", 
				"Damien", "Agnes", "Gabriela", "Stephen", "Emmanuel",
				"Pat", "Seán", "Luca", "Vitalie", "Darius", 
				"Shane", "Kevin"};
		
		// Create an ArrayList and add everybody
		ArrayList<String> traineeList = new ArrayList<>();
		traineeList.addAll(Arrays.asList(names));
		
		printList(traineeList);
		System.out.println();
		
		// Prompt the user for a name. Print whether that name appears 
		// in the list or not and print the position found. 
		String name = JOptionPane.showInputDialog("Enter a name to search");
		int position = traineeList.indexOf(name);
		// (condition) ? "if true" : "if false" 
		System.out.println( position == -1 ? "Not found" : 
			 String.format("%s found at position %d", name, position + 1));
		
		// Another way to search in a list
		if (traineeList.contains(name)) {
			System.out.println(name + " found at position " + 
						(traineeList.indexOf(name) + 1));
		} else {
			System.out.println(name + " not found");
		}
		
		// Prompt the user for a name to remove from the list and 
		// remove it. Print whether successfully removed.
		name = JOptionPane.showInputDialog("Enter a name to remove");
		if (traineeList.remove(name)) {
			System.out.println(name + " was removed");
		} else {
			System.out.println(name + " not in the list");
		}
		
		// Change somebody’s name in the list, e.g. Pat to Patrick
		String oldName = "Pat";
		String newName = "Patrick";
		// Find the old name
		position = traineeList.indexOf(oldName);
		// if it was found, then change it
		if (position != -1)
			traineeList.set(position, newName);
		else 
			System.out.println(name + " not in the list to change" );
		
		// Print the number of names you have in the list.
		System.out.println("Number of names is the list: " + 
						traineeList.size());
		
		// Sort the list in alphabetically order and print it. 
		Collections.sort(traineeList);
		printList(traineeList);
		
		System.out.println();
		
		// Remove the name at position 7 in the list, print who you 
		// are about to remove before removing that name.
		String removed = traineeList.remove(7);
		System.out.println(removed + " was removed from the list");
		
		// Insert “Santa” at the beginning and print the list.
		traineeList.add(0, "Santa");
		
		printList(traineeList);
		System.out.println();
		
		// Check if the list is empty, now empty the list using one 
		// method and check again to see if it’s empty. 
		System.out.println(traineeList.isEmpty() ? "List is empty" :
			"List is not empty");
		
		traineeList.clear();
		
		System.out.println(traineeList.isEmpty() ? "List is empty" :
				"List is not empty");
	}
	
	private static void printList(ArrayList<String> myList) {
		for (String name: myList) {
			System.out.print(name + " ");
		}
	}
}
/** SAMPLE OUTPUT
Janos Ben James Asen Ewelina Damien Agnes Gabriela Stephen Emmanuel Pat Seán Luca Vitalie Darius Shane Kevin 
Pat found at position 11
Pat found at position 11
Ted not in the list
Number of names is the list: 17
Agnes Asen Ben Damien Darius Emmanuel Ewelina Gabriela James Janos Kevin Luca Patrick Seán Shane Stephen Vitalie 
Gabriela was removed from the list
Santa Agnes Asen Ben Damien Darius Emmanuel Ewelina James Janos Kevin Luca Patrick Seán Shane Stephen Vitalie 
List is not empty
List is empty
*/