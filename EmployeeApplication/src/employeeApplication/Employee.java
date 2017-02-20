package employeeApplication;

import java.time.LocalDate;

public class Employee {
	private String name;
	private String id;
	private LocalDate hireDate;
	
	public Employee(String nameIn, String idIn, LocalDate hireDateIn) {
		name = nameIn;
		id = idIn;
		hireDate = hireDateIn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nameIn) {
		name = nameIn;
	}
	
	public String getId() {
		return id;
	}	
	
	public void setId(String idIn) {
		id = idIn;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(LocalDate hireDateIn) {
		hireDate = hireDateIn;
	}	
}
