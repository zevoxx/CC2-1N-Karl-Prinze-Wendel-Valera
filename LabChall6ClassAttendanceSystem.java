//by: Karl Prinze Wendel F Valera
//to: Ma'am Anna Rhodora M Quitaleg
//Lab Challenge 6: Class Attendance System
package activity.labchall6classattendancesystem;
import java.util.Scanner;
public class LabChall6ClassAttendanceSystem {
    
    public static void attendanceChecker(int totalNumStud, int present, int absent)
    {
        Scanner Obj = new Scanner(System.in);
        for (int i = 1; i <= totalNumStud; i++) // loops user input scanner as many times as the total student
            {
                System.out.print("Is student " + i + " present? (Y/N): "); // asks if student number "blank" is present or absent
                String yesNo = Obj.nextLine();
                if (yesNo.equalsIgnoreCase("Y")) // adds amount to present students
                {
                    present++; 
                }
                else if (yesNo.equalsIgnoreCase("N")) // adds amount to absent students
                {
                    absent++;
                }
                else // for invalid inputs/user inputs
                {
                    System.out.println("Invalid Input");
                    i--;
                }
            }
        System.out.println("Total present: " + present); // prints present
        System.out.println("Total absent: " + absent); // prints absent
    }
    public static void main(String[] args) 
    {
        Scanner Obj = new Scanner(System.in);
        System.out.println("KPWFV'S CLASSROOM ATTENDANCE SYSTEM\n");
        int totalNumStud, present, absent; // declaration of variables
        System.out.print("Enter the total number of students: "); 
        totalNumStud = Obj.nextInt(); // input for total num of students
        present = 0;
        absent = 0;
        attendanceChecker(totalNumStud, present, absent); // calls the function that checks attendance
    }
}
