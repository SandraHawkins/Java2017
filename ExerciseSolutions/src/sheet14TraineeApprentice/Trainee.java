package sheet14TraineeApprentice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * Abstract class: cannot be instantiated. Provides functionality to 
 * 				   all child classes. Exists to be extended. 
 * Final class:    cannot be extended / subclasses.  
 */
public abstract class Trainee {
	
	private String name;
	private LocalDate dob;
	private String ppsNumber;
	
	public Trainee(String name, LocalDate dob, String ppsNumber) {
		this.name = name;
		this.dob = dob;
		this.ppsNumber = ppsNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String getPpsNumber() {
		return ppsNumber;
	}
	
	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		return this.getClass().getSimpleName() + 
				", name=" + name + 
				", date of birth=" + dob.format(formatter) + 
				", PPS Number=" + ppsNumber;
	}
}