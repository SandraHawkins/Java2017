import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JOptionPane;

/** 
 * Author: Sandra Hawkins
 * Date:   7 Jun 2017
 * Exceptions//FileNotFoundEg.java
 */

/**
 * When reading from a File, you can use a FileReader object. Calling
 * the FileReader constructor might throw a checked FileNotFoundException.
 * As it is checked, your code will not compile until you deal with that
 * exception. You can surround you calling code in a try / catch
 * to deal with it. 
 */
public class FileNotFoundEg {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(
									new FileReader("myFile.txt"));
		} catch (FileNotFoundException e) {
			//System.out.println("File not found");
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
