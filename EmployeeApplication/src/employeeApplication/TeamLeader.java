package employeeApplication;

import java.time.LocalDate;

public class TeamLeader extends ProductionWorker {
	private double bonus;
	private int trainingRequired;
	private int trainingCompleted;
	
	public TeamLeader(String nameIn, String idIn, LocalDate hireDateIn, int shiftIn, double hourlyRateIn, double bonusIn, int trainingRequiredIn, int trainingCompletedIn) {
		super(nameIn, idIn, hireDateIn, shiftIn, hourlyRateIn);
		bonus = bonusIn;
		trainingRequired = trainingRequiredIn;
		trainingCompleted = trainingCompletedIn;
	}

	public TeamLeader(ProductionWorker prodWorkerIn, double bonusIn, int trainingRequiredIn, int trainingCompletedIn) {
		super(prodWorkerIn.getName(), prodWorkerIn.getId(), prodWorkerIn.getHireDate(), prodWorkerIn.getShift(), prodWorkerIn.getHourlyRate());
		bonus = bonusIn;
		trainingRequired = trainingRequiredIn;
		trainingCompleted = trainingCompletedIn;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonusIn) {
		bonus = bonusIn;
	}
	
	public int getTrainingRequired() {
		return trainingRequired;
	}
	
	public void setTrainingRequired(int trainingRequiredIn) {
		trainingRequired = trainingRequiredIn;
	}
	
	public int getTrainingCompleted() {
		return trainingCompleted;
	}
	
	public void setTrainingCompleted(int trainingCompletedIn) {
		trainingCompleted = trainingCompletedIn;
	}
}