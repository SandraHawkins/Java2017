package sheet7EmployeeAndClock;

public class Clock {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Clock() {
		// all member variables get default value, i.e. the time
		// will be 00:00:00
	}
	
	/* Sets up a new clock object with values for each member variable, e.g.:
	 * 
	 * 		Clock c1 = new Clock(11, 30, 0);
	 * 		System.out.println(c1);				// 11:30:00
	 */
	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Takes in a value for the hours member variable and prints
	 * a message if that value isn't between 0 and 23 inclusive.
	 */
	public void setHours(int hours) {
		if (hours < 0 || hours > 23)
			System.out.println(hours + " is invalid for hours");
		else 
			this.hours = hours;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * Takes in a value for the minutes member variable and prints
	 * a message if that value isn't between 0 and 59 inclusive.
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59)
			System.out.println(minutes + " is invalid for minutes");
		else 
			this.minutes = minutes;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * Takes in a value for the seconds member variable and prints
	 * a message if that value isn't between 0 and 59 inclusive.
	 */
	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds > 59)
			System.out.println(seconds + " is invalid for seconds");
		else 
			this.seconds = seconds;
	}
	
	/**
	 * Takes in an amount to add to hours, if the new value for hours
	 * goes above 23, it will 'wrap' it around, e.g. add 1 onto 23 hours
	 * and it will become 0, add 2 onto 23 and it will become 1. 
	 */
	public void incrementHours(int amount) {
		hours += amount;  // 23 + 1 = 24
		if (hours > 23)
			hours = hours % 24;   // 24 % 24 = 0
	}
	
	/**
	 * Takes in an amount to add to minutes, if the new value for minutes
	 * goes above 59, it will 'wrap' around and call the incrementHours()
	 * method to add to the hours member variable.
	 */
	public void incrementMinutes(int amount) {
		minutes += amount;     // 23:50:05
							//  +    10
							//    24:60:00
		if (minutes > 59) { 
			//hours += minutes / 60;
			incrementHours(minutes / 60);
			minutes = minutes % 60;  // 60 % 60 = 0
		}
	}
	
	/**
	 * Takes in an amount to add to seconds, if the new value for seconds
	 * goes above 59, it will 'wrap' around and call the incrementMinutes()
	 * method to add to the minutes member variable.
	 */
	public void incrementSeconds(int amount) {
		seconds += amount;
		
		if (seconds > 59) {
			incrementMinutes(seconds / 60);
			seconds = seconds % 60;
		}
	}
	
	/**
	 * Takes in three arguments to allow the compete time to be changed.
	 * It will call reset() first, to set the time back to 00:00:00
	 */
	public void setTime(int hours, int minutes, int seconds) {
		reset();
		incrementHours(hours);
		incrementMinutes(minutes);
		incrementSeconds(seconds);
	}
	
	/**
	 * Sets all member variables to 0.
	 */
	public void reset() {
		/* 0 gets assigned to all member variables, this line is 
		 * read from right to left */
		hours = minutes = seconds = 0;
	}

	/**
	 * Returns a String with the time in the following format: 
	 * 
	 * 				hh:mm:ss
	 */
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
}