package sheet7EmployeeAndClock;

public class MainForClock {

	public static void main(String[] args) {

		Clock c1 = new Clock(11, 30, 0);
		System.out.println(c1);		// 11:30:00
		c1.incrementHours(3);
		System.out.println(c1);		// 14:30:00
		c1.incrementMinutes(50);
		System.out.println(c1);		// 15:20:00
		c1.incrementSeconds(50);
		System.out.println(c1);		// 15:20:50
		c1.incrementSeconds(15);
		System.out.println(c1);		// 15:21:05
		c1.reset();
		System.out.println(c1);		// 00:00:00
		
		Clock c2 = new Clock(23, 59, 59);
		c2.incrementSeconds(2);
		System.out.println(c2);		// 00:00:01
		
		c2.setTime(48, 120, 120);
		System.out.println(c2);		// 02:02:00
	}
}