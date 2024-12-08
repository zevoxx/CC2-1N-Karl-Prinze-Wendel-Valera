//by: Karl Prinze Wendel F Valera
//to: Ma'am Anna Rhodora M Quitaleg
//Laboratory Challenge No. 8: Employee Payroll System
package activity.employee;
import java.util.HashMap;
import java.util.Scanner;
public class Employee {
    //given attributes
    private String employeeID, name;
    private double hourlyWage, hoursWorked;
    
    // constructor method
    public void constructor(String employeeId, String employeeName, double employeeHourlyWage, double employeeHoursWorked)
    {
        // initializes the attributes
        employeeID = employeeId;
        name = employeeName;
        hourlyWage = employeeHourlyWage;
        hoursWorked = employeeHoursWorked;
    }
    
    // display method
    public void displayEmployeeDetails(){
        System.out.print("\nID: " + employeeID);
        System.out.print(", Name: " + name);
        System.out.print(", Wage: " + hourlyWage);
        System.out.print(", Hours Worked: " + (int)hoursWorked);
    }
    
    // calculates and displays salary
    public void calculateSalary(){
        double salary = hourlyWage * hoursWorked;
        System.out.print(", Salary: " + salary);
    }
    
    public static void main(String[] args) {
        HashMap<Integer, String> digits = new HashMap<>();
        digits.put(0, "ID"); // converts "0" to "ID"
        digits.put(1, "Name"); // converts "1" to "Name"
        digits.put(2, "Hourly Wage"); // converts "2" to "Hourly Wage"
        digits.put(3, "Hours Worked"); // converts "3" to "Hours Worked"
        Scanner Obj = new Scanner(System.in);
        System.out.println("KPWFV's Employee Payroll System");
        Employee employee1 = new Employee(); //employee object 1
        Employee employee2 = new Employee(); //employee object 2
        
        /* 2D ARRAY IMAGINARY VISUAL
        -------------------------------------------------------
                    | ID | Name | Hourly Wage | Hours Worked
        -------------------------------------------------------
        employee 1  |    |      |             |
        -------------------------------------------------------
        employee 2  |    |      |             |
        -------------------------------------------------------
        */
        
        // Shortcut method 
        String [][] details = new String[2][4]; // array for employee details
        for (int row = 0; row < 2; row++){ // loops rows
            System.out.println("\nEmployee " + (row+1) + ":"); 
            for (int col = 0; col < 4;col++){ // loops columns
                System.out.print("\n\t" + digits.get(col) + ": ");
                details[row][col] = Obj.nextLine();
            }
        }
        /* Brute force
        // User input details for employee 1
        System.out.println("\nEmployee 1: ");
        System.out.print("\n\tID: "); 
        String id1 = Obj.nextLine(); // input for employee 1 id
        System.out.print("\n\tName: ");
        String name1 = Obj.nextLine(); // input for employee 1 name
        System.out.print("\n\tHourly Wage: ");
        double hoursWage1 = Obj.nextDouble(); // input for employee 1 hourly wage
        System.out.print("\n\tHours Worked: ");
        double hoursWork1 = Obj.nextDouble(); // input for employee 1 hours worked
        
        // User input details for employee 2
        System.out.println("\nEmployee 2: ");
        System.out.print("\n\tID: "); 
        String id2 = Obj.nextLine(); // input for employee 2 id
        System.out.print("\n\tName: ");
        String name2 = Obj.nextLine(); // input for employee 2 name
        System.out.print("\n\tHourly Wage: ");
        double hoursWage2 = Obj.nextDouble(); // input for employee 2 hourly wage
        System.out.print("\n\tHours Worked: ");
        double hoursWork2 = Obj.nextDouble(); // input for employee 2 hours worked
        */
        
        employee1.constructor(details[0][0], details[0][1], Double.parseDouble(details[0][2]), Double.parseDouble(details[0][3])); //initializes employee 1 details
        employee2.constructor(details[1][0], details[1][1], Double.parseDouble(details[1][2]), Double.parseDouble(details[1][3])); //initializes employee 2 details
        System.out.println("\nCalculating salaries...");
        System.out.print("\nEmployee Details");
        employee1.displayEmployeeDetails(); // displays employee 1 details
        employee1.calculateSalary(); // calculates and displays employee 1 salary
        employee2.displayEmployeeDetails(); // displays employee 2 details
        employee2.calculateSalary(); // calculates and dsiplays employee 2 salary
    }
}
