import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/** 
 * Author: Sandra Hawkins
 * Date:   30 May 2017
 * RandomStuff//HowToUseLocalDate.java
 */

public class HowToUseLocalDate {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);			// 2017-05-30
		
		LocalDate pastDate = LocalDate.of(1990, Month.DECEMBER, 7);
		System.out.println(pastDate);		// 2017-05-30

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		Employee e1 = new Employee(LocalDate.of(1994, Month.AUGUST, 22));
		System.out.println(e1);
	}
}

class Employee {
	
	private LocalDate dateOfBirth;

	public Employee(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String toString() {
		return "Employee dateOfBirth = " +
				String.format("%d/%02d/%d", 
						dateOfBirth.get(ChronoField.DAY_OF_MONTH),
						dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
						dateOfBirth.get(ChronoField.YEAR));
	}
}
/** OUTPUT
2017-05-30
1990-12-07
java.util.GregorianCalendar[time=1496132730284,areFieldsSet=true,
areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[
id="Europe/London",offset=0,dstSavings=3600000,useDaylight=true,
transitions=242,lastRule=java.util.SimpleTimeZone[id=Europe/London,
offset=0,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,
startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,
endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]
],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2017,MONTH=4,
WEEK_OF_YEAR=22,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=150,
DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,
MINUTE=25,SECOND=30,MILLISECOND=284,ZONE_OFFSET=0,DST_OFFSET=3600000]
Employee dateOfBirth = 22/08/1994
*/
