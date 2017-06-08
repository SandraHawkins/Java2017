import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/** 
 * Author: Sandra Hawkins
 * Date:   8 Jun 2017
 * Exceptions//RealUseOfFinally.java
 * 
 * The finally block should be used to close any resources, e.g. close
 * a file reader/ or a connection to a database. 
 * 
 * It is a bit messy because calling .close() on a reader might through
 * an exception and therefore you need a try / catch in the finally block.
 * 
 * Oracle have solved this problem by creating a new construct called
 * 'try with resources'. Here is an example:
 * 
 * 		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
 * 
 * 			// code to read from the file
 * 	
 * 		} // br will automatically be closed. 
 * 
 * Any resources opened in the parenthesis will automatically be closed
 * at the end of the try block }
 */

public class RealUseOfFinally {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			System.out.println("Contents of the file.....");
			
			FileReader fr = new FileReader("src/Thursday.txt");
			br = new BufferedReader(fr);
			
			String line = "";
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			// br.close(); // won't happen if an exception occurs, so
			// the finally block will be responsible for closing the 
			// BufferedReader
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		} catch (IOException e) { 
			JOptionPane.showMessageDialog(null, "Error reading from file");
			e.printStackTrace();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something else happened");
			e.printStackTrace();
		} finally {
			System.out.println("A finally block Will ALWAYS execute");
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
/** OUTPUT
Contents of the file.....
Hello
It's Thursday

Last line in the file.
A finally block Will ALWAYS execute
*/
