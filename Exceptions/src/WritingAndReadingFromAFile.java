import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/** 
 * A try must have curly brackets. 
 * 
 * A catch or a finally block must follow a try block. If you have a try
 * block, you MUST have a catch or finally block after it. 
 * 
 * If you call a method that might throw a checked exception, you MUST
 * handle it, either by:
 * - placing a try / catch block around your code or
 * - declaring that the method might throw those exceptions, e.g.:
 * 		
 * 		public static void main(String[] args) 
 * 				throws FileNotFoundException, IOException  { ... }
 * 
 * 		If an exception occurs, it is thrown out of main and the JVM 
 * 		will print the stack trace.
 *  
 * If you catch a checked exception, there must be code in the try
 * block that might cause that exception. 
 * 
 * The order of catching exceptions: child first, parent last. 
 * 
 * A finally block, must appear last after all the catch block and
 * will ALWAYS execute. 
 * 
 * If an exception occurs, only one catch block will execute, the
 * first matching catch block. 
 * 
 * When an exception occurs in a try block, execute will jump from 
 * the try block to the first matching catch. The remaining code in
 * the try block will not execute. 
 * 
 * When an exception is caught, code after the catch will execute. 
 * Your program will carry on and not stop. 
 * 
 * If a method might throw a checked exception, e.g. The readline() 
 * method in the BufferedReader class might throw a checked 
 * IOException, therefore it must list that exception in the method
 * declaration or it wouldn't compile:
 * 
 *  		public String readLine() throws IOException {}
 *  
 * throw new ArgumentTooLongException(newName + 
 * 			" is too long, it must be 30 characters or under");
 * 
 * The String passed into an exception's constructor is a message giving
 * more detail about what went wrong. This text/ message will be printed
 * as part of the stack trace or you can retrieve in a catch block as 
 * follows:
 * 
 *  	try {
 *  		e1.setName("Adam Bart Carl Dennis Edward Frank");
 *  	} catch (ArgumentTooLongException e) {
 *  		e.printStackTrace(); // message included
 *      	System.out.println(e.getMessage());
 *  	}
 */
public class WritingAndReadingFromAFile {

	public static void main(String[] args) {
				
		/* Used below in the PrintWriter and FileReader constructors */
		String filename = "src/Thursday.txt";
		
		/* The first try block writes out to the file. */
		try {
			/* If the PrinterWriter object cannot be created, e.g. it might
			 * not have permissions to create the file, then a 
			 * FileNotFoundException will be created and execution will just 
			 * to the matching catch block underneath, any remaining code in
			 * the try block will not execute. */
			PrintWriter pw = new PrintWriter(filename);
			
			// We only want to write to the file when the previous line
			// is successful. If the previous line isn't successful,
			// execution will jump to the catch.
			pw.println("Hello");
			pw.println("It's Thursday");
			pw.println();
			pw.println("Last line in the file.");
			
			pw.flush(); // Move any characters still in the stream out to the file
			pw.close();	// Close the PrintWriter
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File could not be created");
			e.printStackTrace();
		}
		
		/* The second try block reads from the file. */
		try {
			System.out.println("Contents of the file.....");
			
			/* A BufferedReader is the best class to read from a file, as
			 * it can read a whole line at once (readline()), it's 
			 * constructor takes a Reader object and therefore an instance
			 * of FileReader is passed in.  The FileReader constructor takes
			 * in a String containing the filename to read from. */
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			/* br.readLine() reads a line of text from the file and returns
			 * it as a String. When it reaches the end of the file, readline()
			 * will return null. Therefore the following while() loop will
			 * read a line from the file, assign it to 'line' and keeping 
			 * looping/ reading until null is returned.  */
			String line = "";
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		/* FileNotFoundException might be thrown from creating a 
		 * FileReader object if the file cannot be found */
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		/* IOException might be thrown from br.readLine() if there is 
		 * a problem reading from the file, e.g. the file disappears
		 * during reading. */
		} 
		//System.out.println("Hello!");  // No code between catches
		catch (IOException e) { 
			JOptionPane.showMessageDialog(null, "Error reading from file");
			e.printStackTrace();
		/* Exception is the parent of all Exceptions, this would catch
		 * any unchecked exceptions, e.g. NullPointerException.  */
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something else happened");
			e.printStackTrace();
		} finally {
			System.out.println("A finally block Will ALWAYS execute");
		}
		
		// The next line will execute whether an exception occurs or not.
		System.out.println("End of main");
	}
}

/** OUTPUT
Contents of the file.....
Hello
It's Thursday

Last line in the file.
A finally block Will ALWAYS execute
End of main
*/