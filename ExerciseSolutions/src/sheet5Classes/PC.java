/** 
 * Author: Sandra Hawkins
 * Date:   22 May 2017
 * ExerciseSolutions/sheet5Classes/PC.java
 */ 
package sheet5Classes;

public class PC extends Object {
	
	/* Member variables */
	private int ram;
	private int hardDrive;
	private String os;
	/* The datatype here refers to the enum below */
	private MonitorSize monitorSize;
	private double cost; // no setCost() method but there is a calculateCost()
	
	/* Constants/ Static / class variables */
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	public static final int HARD_DRIVE_500_GB = 500;
	public static final int HARD_DRIVE_1_TB = 1;
	public static final int HARD_DRIVE_2_TB = 2;
	
	public static final String OS_LINUX = "Linux";
	public static final String OS_SOLARIS;
	public static final String OS_MAC_LEOPARD;
	public static final String OS_WINDOWS_7;
	public static final String OS_WINDOWS_10;
	
//	public static final int MONITOR_15 = 15;
//	public static final int MONITOR_17 = 17;
//	public static final int MONITOR_22 = 22;
//	public static final int MONITOR_27 = 27;
//	public static final int MONITOR_32 = 32;
	
	/* An enum is where you make up your own datatype, e.g. it's not
	 * and int with ~9.8 million possible values it's a MonitorSize
	 * with 11 possible values.
	 * To access an enum's value in THIS class, it will be:
	 * 
	 *   		MonitorSize.MONITOR_36
	 *   
	 * HUGE advantage: I don't need to validate the value for MonitorSize
	 * in the set method because the compiler will only allow a value
	 * from the list here.    
	 * 
	 * An enum can be declared inside a class, e.g. inside the curly 
	 * brackets of PC or in a file of its own.
	 **/
	public enum MonitorSize { MONITOR_13, MONITOR_15, MONITOR_17, MONITOR_22, 
		MONITOR_27, MONITOR_32, MONITOR_36, MONITOR_46, MONITOR_55,
		MONITOR_66, MONITOR_72, MONITOR_100 };
	
	
	/* A static initialisation block. This can be used to initialise
	 * static variables. Static variables belong to the class, they
	 * exist before any objects are created. Their values can be used
	 * for creating objects and given to member variables.
	 * Member variables belong to the object, every time an object is
	 * created, e.g.  		 PC pc1 = new PC(); 
	 * the object gets a copy of each member variables. 
	 * 
	 * Static variable exists before member variables. A class is a 
	 * template for creating objects, the class must exist before objects
	 * can be created. 
	 * 
	 * A final variable must be initialised. I.e. it must be given a 
	 * value either on the line where it is declared OR in a static 
	 * initialisation block. 
	 * 
	 * A static block will execute before any constructors are called. 
	 * */
	static {
		OS_MAC_LEOPARD = "Mac Leopard";
		OS_SOLARIS = "Solaris";
		OS_WINDOWS_10 = "Windows 10";
		OS_WINDOWS_7 = "Windows_7";
		System.out.println("In the static block");
	}
	
	/* In the no-args constructor, defaults are assigned to each
	 * member variable and the cost is set. */
	public PC() {
		ram = RAM_4_GB;
		hardDrive = HARD_DRIVE_500_GB;
		os = OS_WINDOWS_7;
		monitorSize = MonitorSize.MONITOR_17;
		cost = 350;
	}

	public PC(int ram, int hardDrive, String os, MonitorSize monitorSize) {
		this();
		setRam(ram);
		setHardDrive(hardDrive);
		setOs(os);
		setMonitorSize(monitorSize);
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		if (ram == RAM_4_GB || ram == RAM_8_GB || 
				ram == RAM_16_GB)
			this.ram = ram;
		else {
			System.out.println(ram + " is invalid for RAM, default set to 4");
		}
	}

	public int getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(int hardDrive) {	
		if (hardDrive == HARD_DRIVE_1_TB ||
				hardDrive == HARD_DRIVE_2_TB || 
				hardDrive == HARD_DRIVE_500_GB)
			this.hardDrive = hardDrive;
		else 
			System.out.println(hardDrive + " is invalid for hard drive size, default set to 500 GB");
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		if (os.equals(OS_LINUX) || os.equals(OS_MAC_LEOPARD) ||
				os.equals(OS_SOLARIS) || os.equals(OS_WINDOWS_10) || 
				os.equals(OS_WINDOWS_7)) {
			this.os = os;
		} else {
			System.out.println("Invalid opearting system, setting to the default of Windows 7");
		}
	}

	public MonitorSize getMonitorSize() {
		return monitorSize;
	}

	/* No validation is required for an enum because the compiler will
	 * not allow any other datatype to be assigned, e.g. you cannot
	 * pass an int into this method, it will not compile. */
	public void setMonitorSize(MonitorSize monitorSize) {
		this.monitorSize = monitorSize;
	}

	public double calculateCost() {
		if (ram == RAM_8_GB)
			cost += 20;
		else if (ram == RAM_16_GB)
			cost += 40;

		if (hardDrive == HARD_DRIVE_1_TB) 
			cost += 60;
		else if (hardDrive == HARD_DRIVE_2_TB) 
			cost += 80;
		
		if (os.equals(OS_LINUX) || os.equals(OS_SOLARIS))
			cost -= 20;
		else if (os.equals(OS_MAC_LEOPARD))
			cost += 1000;
		else if (os.equals(OS_WINDOWS_10))
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
			System.out.println("In the default of the switch");
			break;
		}
	
		return cost;
	}

	@Override
	public String toString() {
		return "\nPC ram=" + ram + 
				"\nhardDrive=" + hardDrive + 
				(hardDrive == HARD_DRIVE_500_GB ? "GB": "TB") +
				"\nos=" + os + 
				"\nmonitorSize=" + 
				/* The next line converts the enum's value to a String, 
				 * then converts it to lower case, replaces the underscore
				 * with a space, replaces the small 'm' with a 'M' and
				 * add a " onto the end. */
				monitorSize.toString().toLowerCase().replace('_', ' ').
						replace('m', 'M') + "\"" +
				String.format("\ncost= €%.2f", calculateCost());
		
		/* Ternary operators 
		 *            condition    ? true part : false part
		 * 
		 * S.o.pln( hourOfDay < 12 ? "morning" : "afternoon");
		 * 
		 * */
	}
}
