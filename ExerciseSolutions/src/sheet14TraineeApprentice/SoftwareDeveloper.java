package sheet14TraineeApprentice;

import java.time.LocalDate;

public class SoftwareDeveloper extends Trainee {

	public SoftwareDeveloper(String name, LocalDate dob, String ppsNumber) {
		super(name, dob, ppsNumber);
	}
	
	/* No toString() it will execute the inherited toString() */
//	public String toString() {
//		return "Software Developer, " + super.toString();
//	}
}
