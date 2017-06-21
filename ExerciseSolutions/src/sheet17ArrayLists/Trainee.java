/** 
 * Author: Sandra Hawkins
 * Date:   20 Jun 2017
 * ExerciseSolutions/sheet17ArrayLists/Trainee.java
 */ 

package sheet17ArrayLists;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Trainee {
	
	private String name;
	private String address;
	private LocalDate birthday;
	
	public Trainee(String name) {
		this.name = name;
	}
	
	public Trainee(String name, String address, LocalDate birthday) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public boolean equals(Object obj) {
		if (obj == null || this == null) 	return false;
		// .getClass() called on any reference returns the class name
		// of the object
		if (!obj.getClass().equals(this.getClass())) return false;
	
		Trainee other = (Trainee)obj;
		if (this.name == null || other.name == null ||
				this.address == null || other.address == null ||
				this.birthday == null || other.birthday == null)
			return false;
		
		if (this.name.equals(other.name) && 
				this.address.equals(other.address) && 
				this.birthday.equals(other.birthday)) 
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		return "\nName=" + name + 
				", address=" + address + 
				", birthday=" + birthday.format(
								DateTimeFormatter.ofLocalizedDate(
										FormatStyle.MEDIUM)) ;
	}
}
