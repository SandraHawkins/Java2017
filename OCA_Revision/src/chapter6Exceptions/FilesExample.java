/** 
 * Author: Sandra Hawkins
 * Date:   7 Sep 2017
 * OCA_Revision/chapter6Exceptions/FilesExample.java
 */ 

package chapter6Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* You don't need to know about Files for the exam but you do need
 * to know that IOException <-- FileNotFoundException are both
 * checked exceptions. */
import javax.swing.JOptionPane;
/*
 * - If you call a method that might throw a checked exception, 
 *   you need to either:
 *   1. put a try catch block around the method call.
 *   2. the containing method must declare the exception
 *   
 * - If you have a try block, you must have a catch or a finally.
 * 
 * - You can have multiple catches but you must catch the most
 *   specific exception first (i.e. the child exception first). 
 *   E.g. FileNotFoundException before IOException.
 *   
 * - The finally block is optional. It will always execute unless
 *   the JVM is shutdown, e.g. System.exit(1);
 *   It must follow the try or the last catch.
 *   
 * - try / catch blocks can be embedded.
 * 
 * - By catching an exception, the program carries on. An attempt 
 *   can be made to fix the problem.
 */
class MadeUpException extends Exception { }			 // checked
class AnotherException extends RuntimeException { }  // unchecked
class ChildException extends AnotherException {}   

// class IOException extends Exception { }
// class FileNotFoundException extends IOException { }

public class FilesExample {

	public static void main(String[] args) {
	
		/* Declared before the try so they can be closed in the
		 * finally block. */
		FileReader fr = null;
		BufferedReader br = null; 
		try {
			/* A FileNotFoundException occurs on the following line 
			 * and therefore execution will jump to the matching catch. */
			fr = new FileReader("Thursday.txt"); 
			br = new BufferedReader(fr);
			
			System.out.println("Won't get here as Thursday.txt deosn't exist");
			System.out.println("Exception occurs from the line 'fr = new...'");
			
			String lineFromFile = "";
			while ( (lineFromFile = br.readLine()) != null ) {
				System.out.println(lineFromFile);
			}
		} catch (FileNotFoundException e) { //Child first
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Could not find your file");
		} catch (IOException e) {			// Parent underneath
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error reading from file");
		} finally { // For closing resources used in the try
			/* Will always execute unless there is a System.exit(1);
			 * in previously.  */
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
		/* Try with resources, not on the OCA exam. Any resource 
		 * opened in the () will automatically be closed at the
		 * end of the try block.
		 * */
		try (FileReader ff = new FileReader("")) {
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		System.out.println("End of main"); // will print
	}
}
