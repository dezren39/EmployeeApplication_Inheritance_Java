package employeeApplication;

import java.time.LocalDate;

public class ShiftSupervisor extends Employee {
	private double salary = 0;
	private double bonus = 0;
	
	public ShiftSupervisor(String nameIn, String idIn, LocalDate hireDateIn, double salaryIn, double bonusIn) {
		super(nameIn, idIn, hireDateIn);
		salary = salaryIn;
		bonus = bonusIn;
	}
	
	public ShiftSupervisor(Employee empIn, double salaryIn, double bonusIn) {
		super(empIn.getName(), empIn.getId(), empIn.getHireDate());
		salary = salaryIn;
		bonus = bonusIn;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salaryIn) {
		salary = salaryIn;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonusIn) {
		bonus = bonusIn;
	}
}
