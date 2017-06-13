package sheet15Exceptions;

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
	 * 
	 * The set methods might throw an InvalidTimeException and the
	 * incrementSeconds() method might throw an IncrementProblemException.
	 * As both are checked exceptions, the constructor must declare that it
	 * might throw either exception by including this throws clause in the
	 * header:   
	 * 			throws InvalidTimeException, IncrementProblemException
	 * 
	 * At runtime, only one exception can actually be thrown and control
	 * will be passed back to the calling code in main() where it will be
	 * handled.
	 */
	public Clock(int hours, int minutes, int seconds) 
							throws InvalidTimeException,
								   IncrementProblemException {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
		
		incrementSeconds(seconds);
		
//		this.hours = hours;
//		this.minutes = minutes;
//		this.seconds = seconds;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Takes in a value for the hours member variable and throws an
	 * exception if that value isn't between 0 and 23 inclusive.
	 */
	public void setHours(int hours) throws InvalidTimeException {
		if (hours < 0 || hours > 23)
			
			throw new InvalidTimeException(hours + 
					" is invalid for hours");
		// else
		this.hours = hours;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * Takes in a value for the minutes member variable and throws an
	 * exception if that value isn't between 0 and 59 inclusive.
	 */
	public void setMinutes(int minutes) throws InvalidTimeException {
		if (minutes < 0 || minutes > 59)
			
			throw new InvalidTimeException(minutes + 
					" is invalid for minutes");
		//else 
			this.minutes = minutes;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * Takes in a value for the seconds member variable and throws
	 * an exception if that value isn't between 0 and 59 inclusive.
	 */
	public void setSeconds(int seconds) throws InvalidTimeException {
		if (seconds < 0 || seconds > 59)
			
			throw new InvalidTimeException(seconds + 
					" is invalid for seconds");
		//else 
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
	 * @throws IncrementProblemException 
	 */
	public void incrementSeconds(int amount) 
			throws IncrementProblemException {
		
		/* If the amount is under 0 or over 120, then an IncrementProblemException
		 * will be thrown, this is just to demonstrate in the constructor
		 * above what happens when the constructor code might throw more 
		 * than one exception. */
		if (amount < 0 || amount > 120) 
			
			throw new IncrementProblemException(
					"Cannot add on " + amount + " to seconds");
			
		seconds += amount;
		
		if (seconds > 59) {
			incrementMinutes(seconds / 60);
			seconds = seconds % 60;
		}
	}
	
	/**
	 * Takes in three arguments to allow the compete time to be changed.
	 * It will call reset() first, to set the time back to 00:00:00
	 * @throws IncrementProblemException 
	 */
	public void setTime(int hours, int minutes, int seconds) 
			throws IncrementProblemException {
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