/** 
 * Author: Sandra Hawkins
 * Date:   2 Aug 2017
 * OCA_Revision/chapter1JavaBuildingBlocks/ArgsInMain.java
 */ 

package chapter1JavaBuildingBlocks;

/* 
 * To compile from the command line (in the src directory):
 * 
 * > javac chapter1JavaBuildingBlocks/ArgsInMain.java
 * > java chapter1JavaBuildingBlocks.ArgsInMain
 * 
 * When no arguments are passed to main, the length of args will be 0:
 * 
 * 		System.out.println(args.length);  // 0
 * 
 * > java chapter1JavaBuildingBlocks.ArgsInMain 1 "Arg 2" Three Four
 * 
 * The arguments are passed in as a String array:
 * 
 *              0       1       2      3
 *    args --> [1] ["Arg 2"] [Three] [Four]
 * 
 */
public class ArgsInMain {

	public static void main(String [] args) {
		
		System.out.println(args[0]);  // 1
		System.out.println(args[2]);  // Three
		//System.out.println(args[4]);  // ArrayIndexOfOutBoundException
	}
}