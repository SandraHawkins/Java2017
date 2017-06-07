package sheet14TraineeApprentice;

import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice {
	
	private String employersName;
	private int phase;
	
	public Carpenter(String name, LocalDate dob, String ppsNumber,
			         String employersName, int phase) {
		super(name, dob, ppsNumber);
		setEmployersName(employersName);
		setPhase(phase);
	}

	@Override
	public void setPhase(int phase) {
		if (phase >= PHASE_ONE && phase <= PHASE_SIX) {
			this.phase = phase;
		} else {
			System.out.println(phase + " is not valid to phase, "
					+ "setting to 1");
			this.phase = PHASE_ONE;
		}
	}

	@Override
	public int getPhase() {
		return phase;
	}

	@Override
	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}

	@Override
	public String getEmployerName() {
		return employersName;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\n\t\tEmployer's name = " + employersName + 
				", phase = " + phase;
	}
}
