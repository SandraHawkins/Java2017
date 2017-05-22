/** 
 * Author: Sandra Hawkins
 * Date:   22 May 2017
 * ExerciseSolutions/sheet5Classes/MainForPCWithEnums.java
 */ 
package sheet5Classes;

import sheet5Classes.PC_WithEnums.HardDrive;
import sheet5Classes.PC_WithEnums.MonitorSize;
import sheet5Classes.PC_WithEnums.OperatingSystem;
import sheet5Classes.PC_WithEnums.RamSize;

public class MainForPCWithEnums {

	public static void main(String[] args) {
				
		PC_WithEnums pc1 = new PC_WithEnums();
		System.out.println(pc1);
		
		/* Because the enums are declared inside the PC_WithEnums class
		 * as opposed to being in a file of their own, I need to prefix 
		 * each enum with the class name, as follows: */
		PC_WithEnums pc2 = new PC_WithEnums(PC_WithEnums.RamSize.RAM_8_GB, 
				PC_WithEnums.HardDrive.HARD_DRIVE_1_TB, 
				PC_WithEnums.OperatingSystem.MAC_LEOPARD, 
				PC_WithEnums.MonitorSize.MONITOR_22);
		System.out.println(pc2);
		
		
		/* The code above to access each enum is really long, i.e.:
		 * ClassName.EnumName.EnumValue, to shorten this code:
		 * 
		 * 			PC_WithEnums.HardDrive.HARD_DRIVE_1_TB  
		 * 					to	
		 * 			HardDrive.HARD_DRIVE_1_TB
		 * 
		 * you can import the enum, the same way as you would import
		 * a class not in the java.lang package. Here is the import
		 * statement for one of the enums:
		 * 
		 * 			import sheet5Classes.PC_WithEnums.HardDrive; 
		 * 
		 * */
		PC_WithEnums pc3 = new PC_WithEnums(RamSize.RAM_16_GB, 
				HardDrive.HARD_DRIVE_1_TB, 
				OperatingSystem.WINDOWS_10, 
				MonitorSize.MONITOR_36);
		System.out.println(pc3);
	}
}
/** OUTPUT

PC ram=RAM_4_GB
hardDrive=HARD_DRIVE_500_GB
os=WINDOWS_7
monitorSize=Monitor 17"
cost= €350.00

PC ram=RAM_8_GB
hardDrive=HARD_DRIVE_1_TB
os=MAC_LEOPARD
monitorSize=Monitor 22"
cost= €1450.00

PC ram=RAM_16_GB
hardDrive=HARD_DRIVE_1_TB
os=WINDOWS_10
monitorSize=Monitor 36"
cost= €570.00
*/