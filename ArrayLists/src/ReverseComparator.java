import java.util.Comparator;

/** 
 * Author: Sandra Hawkins
 * Date:   14 Jun 2017
 * ArrayLists//ReverseComparator.java
 */

public class ReverseComparator implements Comparator<String> {

	@Override
	public int compare(String first, String second) {
		/* Sorts strings in reverse alphabetical order */
		return second.compareTo(first);
	}
}