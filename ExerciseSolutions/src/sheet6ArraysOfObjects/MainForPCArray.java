/** 
 * Author: Sandra Hawkins
 * Date:   24 May 2017
 * ExerciseSolutions/sheet6ArraysOfObjects/MainForPCArray.java
 */ 
package sheet6ArraysOfObjects;

/* import the PC_WithEnums class because I am not in the same package
 * and I want create instances of it. */
import sheet5Classes.PC_WithEnums;
/* PC_WithEnums.* will cover all enums from the PC_WithEnums class*/
import sheet5Classes.PC_WithEnums.*;
//import sheet5Classes.PC_WithEnums.HardDrive;
//import sheet5Classes.PC_WithEnums.MonitorSize;
//import sheet5Classes.PC_WithEnums.OperatingSystem;
//import sheet5Classes.PC_WithEnums.RamSize;

public class MainForPCArray {

	public static void main(String[] args) {

		PC_WithEnums [] myPCs = { 
				new PC_WithEnums(RamSize.RAM_8_GB, 
						HardDrive.HARD_DRIVE_2_TB, 
						OperatingSystem.WINDOWS_10, 
						MonitorSize.MONITOR_32),
				new PC_WithEnums(RamSize.RAM_16_GB, 
						HardDrive.HARD_DRIVE_1_TB, 
						OperatingSystem.LINUX, 
						MonitorSize.MONITOR_100),
				new PC_WithEnums(RamSize.RAM_8_GB, 
						HardDrive.HARD_DRIVE_2_TB, 
						OperatingSystem.MAC_LEOPARD, 
						MonitorSize.MONITOR_55),
				new PC_WithEnums()
		};

		/* A one-liner to create an instance of this class and call 
		 * the method below */
		new MainForPCArray().printPCs(myPCs);
	}
	
	/*
	 * Print outs the PCs whose cost is greater than 400. 
	 */
	private void printPCs(PC_WithEnums [] pcs) {
		for (PC_WithEnums pc : pcs) {
			if (pc.calculateCost() > 400)
				System.out.println(pc);			
		}
	}
}