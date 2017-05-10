import java.util.Calendar;

/** 
 * Author: Sandra Hawkins
 * Date:   10 May 2017
 * ControlFlow//RealClock.java
 */

public class RealClock {

	public static void main(String[] args) {

		for ( ; ; ) { 
			Calendar rightNow = Calendar.getInstance();

			int hour = rightNow.get(Calendar.HOUR_OF_DAY);
			int minute = rightNow.get(Calendar.MINUTE);
			int second = rightNow.get(Calendar.SECOND);

			if (hour == 12 && minute == 30 && second == 55) {
				break;
			}
				
			System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
			
			try {
				Thread.sleep(1000); // sleep for one second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
