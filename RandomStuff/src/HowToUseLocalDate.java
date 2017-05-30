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
