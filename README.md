# EmployeeApplication_Inheritance_Java
This week's little project, demonstrating inheritance.

    package employeeApplication;

    import java.time.LocalDate;

    public class EmployeeApplication {

      public static void main(String[] args) {
      
        //Employee Test Values
        String name = "Drewry Pope";
        String id = "007-B";
        LocalDate hireDate = LocalDate.now();	

        //Production Worker Test Values
        int shift = 8;
        double hourlyRate = 15.75;

        //Team Leader Test Values
        double bonus = 1000;
        int trainingRequired = 80;
        int trainingCompleted = 15;

        //Shift Supervisor Test Values
        double salary = 80000;
        double bonusYearly = 5000;

        //Creating Test Classes
        Employee testEmployee = new Employee(name, id, hireDate);
        ProductionWorker testProdWorker = new ProductionWorker(testEmployee, shift, hourlyRate);
        TeamLeader testTeamLead = new TeamLeader(testProdWorker, bonus, trainingRequired, trainingCompleted);
        ShiftSupervisor testShiftSupervisor = new ShiftSupervisor(testEmployee, salary, bonusYearly);

        //Testing Employee Methods
        System.out.println("Employee Stats:");
        System.out.println("\tName: " + testEmployee.getName());
        System.out.println("\tID: " + testEmployee.getId());
        System.out.println("\tHire Date: " + String.valueOf(testEmployee.getHireDate()));

        //Testing Production Worker Methods
        System.out.println("\nProduction Worker Stats:");
        System.out.println("\tName: " + testProdWorker.getName());
        System.out.println("\tID: " + testProdWorker.getId());
        System.out.println("\tHire Date: " + String.valueOf(testProdWorker.getHireDate()));
        System.out.println("\tShift: " + String.valueOf(testProdWorker.getShift())); 
        System.out.println("\tHourly Rate: " + String.valueOf(testProdWorker.getHourlyRate()));

        //Testing Team Leader Methods
        System.out.println("\nTeam Leader Stats:");
        System.out.println("\tName: " + testTeamLead.getName());
        System.out.println("\tID: " + testTeamLead.getId());
        System.out.println("\tHire Date: " + String.valueOf(testTeamLead.getHireDate()));
        System.out.println("\tShift: " + String.valueOf(testTeamLead.getShift())); 
        System.out.println("\tHourly Rate: " + String.valueOf(testTeamLead.getHourlyRate()));
        System.out.println("\tBonus: " + String.valueOf(testTeamLead.getBonus()));
        System.out.println("\tTraining Required: " + String.valueOf(testTeamLead.getTrainingRequired()));
        System.out.println("\tTraining Completed: " + String.valueOf(testTeamLead.getTrainingCompleted()));

        //Testing Shift Supervisor Methods
        System.out.println("\nShift Supervisor Stats:");
        System.out.println("\tName: " + testShiftSupervisor.getName());
        System.out.println("\tID: " + testShiftSupervisor.getId());
        System.out.println("\tHire Date: " + String.valueOf(testShiftSupervisor.getHireDate()));
        System.out.println("\tSalary: " + String.valueOf(testShiftSupervisor.getSalary()));
        System.out.println("\tYearly Bonus: " + String.valueOf(testShiftSupervisor.getBonus()));

        //Setting New Values, Testing If Changes Set
        testEmployee.setName("Johnny Doe");
        testEmployee.setId("008-M");
        testEmployee.setHireDate(LocalDate.of(2009, 6, 4));

        testProdWorker.setName("Jane Doe");
        testProdWorker.setId("298-M");
        testProdWorker.setHireDate(LocalDate.of(1809, 3, 4));
        testProdWorker.setShift(10);
        testProdWorker.setHourlyRate(20.25);

        testTeamLead.setName("Jillian Deary");
        testTeamLead.setId("008-A");
        testTeamLead.setHireDate(LocalDate.of(2010, 10, 5));
        testTeamLead.setShift(10);
        testTeamLead.setHourlyRate(24);

        testShiftSupervisor.setName("Moriarty Lanfear");
        testShiftSupervisor.setId("228-B");
        testShiftSupervisor.setHireDate(LocalDate.of(2012, 7, 4));
        testShiftSupervisor.setSalary(100000);
        testShiftSupervisor.setBonus(10000);

        System.out.println("\n\nNew Values Set.\n");

        //Testing Employee Methods
        System.out.println("\nEmployee Stats:");
        System.out.println("\tName: " + testEmployee.getName());
        System.out.println("\tID: " + testEmployee.getId());
        System.out.println("\tHire Date: " + String.valueOf(testEmployee.getHireDate()));

        //Testing Production Worker Methods
        System.out.println("\nProduction Worker Stats:");
        System.out.println("\tName: " + testProdWorker.getName());
        System.out.println("\tID: " + testProdWorker.getId());
        System.out.println("\tHire Date: " + String.valueOf(testProdWorker.getHireDate()));
        System.out.println("\tShift: " + String.valueOf(testProdWorker.getShift())); 
        System.out.println("\tHourly Rate: " + String.valueOf(testProdWorker.getHourlyRate()));

        //Testing Team Leader Methods
        System.out.println("\nTeam Leader Stats:");
        System.out.println("\tName: " + testTeamLead.getName());
        System.out.println("\tID: " + testTeamLead.getId());
        System.out.println("\tHire Date: " + String.valueOf(testTeamLead.getHireDate()));
        System.out.println("\tShift: " + String.valueOf(testTeamLead.getShift())); 
        System.out.println("\tHourly Rate: " + String.valueOf(testTeamLead.getHourlyRate()));
        System.out.println("\tBonus: " + String.valueOf(testTeamLead.getBonus()));
        System.out.println("\tTraining Required: " + String.valueOf(testTeamLead.getTrainingRequired()));
        System.out.println("\tTraining Completed: " + String.valueOf(testTeamLead.getTrainingCompleted()));

        //Testing Shift Supervisor Methods
        System.out.println("\nShift Supervisor Stats:");
        System.out.println("\tName: " + testShiftSupervisor.getName());
        System.out.println("\tID: " + testShiftSupervisor.getId());
        System.out.println("\tHire Date: " + String.valueOf(testShiftSupervisor.getHireDate()));
        System.out.println("\tSalary: " + String.valueOf(testShiftSupervisor.getSalary()));
        System.out.print("\tYearly Bonus: " + String.valueOf(testShiftSupervisor.getBonus()));
      }
    }
