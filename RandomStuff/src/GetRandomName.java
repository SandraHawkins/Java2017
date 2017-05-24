import java.util.Random;

public class GetRandomName {

	public static void main(String[] args) {
		
		String [] names = {"Janosh", "Ben", "James", "Asen", "Ewelina", "Damien",
				"Agnes", "Gabriela", "Stephen", "Emmanuel", "Seán", "Pat", "Luca",
				"Vitalie", "Darius", "Jay", "Shane", "Kevin"};
		
		/* Gets a random number between 0 (inclusive) and the length of the 
		 * array (exclusive) to retrieve a name from the names array. */
		System.out.println(names[new Random().nextInt(names.length)]);
	}
}