/** 
 * Author: Sandra Hawkins
 * Date:   22 May 2017
 * ExerciseSolutions/sheet5Classes/PC.java
 */ 
package sheet5Classes;

/* 
 * This class uses enums for Ram, Hard drive, operating system and monitor
 * size. An enum is where you declare you own data type. E.g. a boolean is
 * a data type with two possible values: true or false. OperatingSystem
 * is an enum (i.e. my own made up data type) with the following possible 
 * values: linux, solaris, mac, windows 7 and windows 10. 
 * I can use an enum for a member variable, 
 * 				e.g. private OperatingSystem os;  
 * instead of using an int. When I used an int I could assign one of 
 * ~9.8 possible values, whereas when it's an enum, there are only five
 * possible values. 
 * When it's an enum, the compiler will make sure that only one of the 
 * five possible values are assigned.  
 **/
public class PC_WithEnums extends Object {
	
	/* Member variables. The first four are not int and String types
	 * anymore, they an instance of an enum and only one of the 
	 * corresponding enum values can be assigned to them.  */
	private RamSize ram;
	private HardDrive hardDrive;
	private OperatingSystem os;
	private MonitorSize monitorSize;
	
	private double cost; // no setCost() method but there is a calculateCost()
			
	/* Constants/ Static / class variables */
	/* An enum is where you make up your own datatype, e.g. it's not
	 * and int with ~9.8 million possible values it's a MonitorSize
	 * with 11 possible values.
	 * To access an enum's value in THIS class, it will be:
	 * 
	 *   		MonitorSize.MONITOR_36
	 *   
	 * HUGE advantage: I don't need to validate the values any of the 
	 * enums in the set methods as the compiler will not allow any
	 * other datatype into the method except one of the possible
	 * values for that enum.
	 * 
	 * An enum can be declared inside a class, e.g. inside the curly 
	 * brackets of PC or in a file of its own.
	 **/
	public enum RamSize {
		RAM_4_GB, RAM_8_GB, RAM_16_GB
	}
	
	public enum HardDrive {
		HARD_DRIVE_500_GB, HARD_DRIVE_1_TB, HARD_DRIVE_2_TB
	}
	
	public enum OperatingSystem {
		LINUX, SOLARIS, MAC_LEOPARD, WINDOWS_7, WINDOWS_10
	}
	
	public enum MonitorSize { MONITOR_13, MONITOR_15, MONITOR_17, MONITOR_22, 
		MONITOR_27, MONITOR_32, MONITOR_36, MONITOR_46, MONITOR_55,
		MONITOR_66, MONITOR_72, MONITOR_100 };
	
	/* In the no-args constructor, defaults are assigned to each
	 * member variable and the cost is set. */
	public PC_WithEnums() {
		ram = RamSize.RAM_4_GB;
		hardDrive = HardDrive.HARD_DRIVE_500_GB;
		os = OperatingSystem.WINDOWS_7;
		monitorSize = MonitorSize.MONITOR_17;
		cost = 350;
	}

	public PC_WithEnums(RamSize ram, HardDrive hardDrive, 
			            OperatingSystem os, MonitorSize monitorSize) {
		this();
		setRam(ram);
		setHardDrive(hardDrive);
		setOs(os);
		setMonitorSize(monitorSize);
	}

	public RamSize getRam() {
		return ram;
	}

	/* No validation is required for any of the set methods that take 
	 * an enum because the compiler will not allow any other datatype 
	 * to be assigned, e.g. you cannot pass an int into a method that 
	 * takes an enum type. */
	public void setRam(RamSize ram) {
		this.ram = ram;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {	
		this.hardDrive = hardDrive;
	}

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	public MonitorSize getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(MonitorSize monitorSize) {
		this.monitorSize = monitorSize;
	}

	public double calculateCost() {
		
		// if this method is called multiple times, make sure to reset
		// the cost to the base price each time
		cost = 350;
		
		if (ram == RamSize.RAM_8_GB)
			cost += 20;
		else if (ram == RamSize.RAM_16_GB)
			cost += 40;

		if (hardDrive == HardDrive.HARD_DRIVE_1_TB) 
			cost += 60;
		else if (hardDrive == HardDrive.HARD_DRIVE_2_TB) 
			cost += 80;
		
		if (os == OperatingSystem.LINUX || os == OperatingSystem.SOLARIS)
			cost -= 20;
		else if (os == OperatingSystem.MAC_LEOPARD)
			cost += 1000;
		else if (os == OperatingSystem.WINDOWS_10)
			cost += 40;
		
		switch (monitorSize) {
		case MONITOR_13:
			cost -= 40; 	break;
		case MONITOR_15:
			cost -= 20;		break;
		case MONITOR_22:
			cost += 20; 	break;
		case MONITOR_27:
			cost += 40;		break;
		case MONITOR_32:
			cost += 60;		break;
		case MONITOR_36:
			cost += 80;		break;
		case MONITOR_46: 	
			cost += 100;	break;
		case MONITOR_55:
			cost += 120; 	break;
		case MONITOR_66: 
			cost += 140;	break;
		case MONITOR_72:
			cost += 160; 	break;
		case MONITOR_100:
			cost += 180;	break;
		default: // The default is MONITOR_17;
			cost += 0;
			break;
		}
	
		return cost;
	}

	@Override
	public String toString() {
		return "\nPC ram=" + ram + 
				"\nhardDrive=" + hardDrive +
				"\nos=" + os + 
				"\nmonitorSize=" + 
				/* The next line converts the enum's value to a String, 
				 * then converts it to lower case, replaces the underscore
				 * with a space, replaces the small 'm' with a 'M' and
				 * add a " onto the end. */
				monitorSize.toString().toLowerCase().replace('_', ' ').
						replace('m', 'M') + "\"" +
				String.format("\ncost= €%.2f", calculateCost());
	}
}
