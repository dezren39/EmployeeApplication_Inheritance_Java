package employeeApplication;

import java.time.LocalDate;

public class ProductionWorker extends Employee {
	private int shift;
	private double hourlyRate;
	
	public ProductionWorker(String nameIn, String idIn, LocalDate hireDateIn, int shiftIn, double hourlyRateIn) {
		super(nameIn, idIn, hireDateIn);
		shift = shiftIn;
		hourlyRate = hourlyRateIn;
	}
	
	public ProductionWorker(Employee empIn, int shiftIn, double hourlyRateIn) {
		super(empIn.getName(), empIn.getId(), empIn.getHireDate());
		shift = shiftIn;
		hourlyRate = hourlyRateIn;
	}
	
	public int getShift() {
		return shift;
	}
	
	public void setShift(int shiftIn) {
		shift = shiftIn;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRateIn) {
		hourlyRate = hourlyRateIn;
	}
}
