/** 
 * Author: Sandra Hawkins
 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/ClassesVsFiles.java
 */ 

package chapter1JavaBuildingBlocks;
/* Only one public class per file. 
 * If the class is public, it must be in a file of the same name. 
 * All classes can be default, i.e. I don't have to have one
 * public class.
 * 
 * To compile from the command line:
 * 
 *  > javac ClassesVsFiles.java
 *  > javac Another.java
 *  > javac AndAnother.java
 *  
 * To run from the command line: 
 * 
 *  > java Another
 * 
 * 
 * The above commands won't work as this class is in a package:
 * When you have a class in a package, it MUST be compiled with
 * the package name and it MUST be run with the package name:
 * 
 * The real commands to work (run from the src folder):
 * 
 * > javac chapter1JavaBuildingBlocks ClassesVsFiles.java
 * > javac chapter1JavaBuildingBlocks/Another.java
 * > javac chapter1JavaBuildingBlocks/AndAnother.java
 * 
 * > java chapter1JavaBuildingBlocks.ClassesVsFiles
 * > java chapter1JavaBuildingBlocks.Another
 * > java chapter1JavaBuildingBlocks.AndAnother
 * 
 * */
class ClassesVsFiles {
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}	
}

class Another {
	
}

class AndAnother {
	
}
