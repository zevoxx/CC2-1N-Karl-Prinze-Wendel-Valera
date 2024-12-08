// By: Karl Prinze Wendel F Valera
// To: Ma'am Anna Rhodora M Quitaleg
// Final Challenge No. 3: University Course Enrollment and Grades Tracker (1D and 2D arrays)
package activity.finalchall3universitycourseenrollmentandgradestracker;
import java.util.Scanner;
public class FinalChall3UniversityCourseEnrollmentAndGradesTracker {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("KPWFV's University Course Enrollment and Grades Tracker");
        String [] students = new String [5]; // 1D array for student names
        String [] subjects = new String [5]; // 1D array for subject names
        double [][] grades = new double[5][3]; // 2D array for the grades of each student per subject
        double [] TotalIndividual = new double[5]; // 1D array for the total grades of each student to get average
        double [] averageIndividual = new double[5]; // 1D array for the average grades of each student
        double averageAll, totalAll = 0; // variables to get the average of all students
        
        /* 1D STUDENT NAMES AND 2D GRADES ARRAY IMAGINARY VISUAL
        
                            1D Subjects array
                            -------------------------
                            |  Sub  |  Sub  |  Sub  |
                            -------------------------
                                |       |       |
        1D Students array   2D Grades array
        ------------        -------------------------
        Student 1   ->      | grade | grade | grade |
        ------------        -------------------------
        Student 2   ->      | grade | grade | grade |
        ------------        -------------------------
        Student 3   ->      | grade | grade | grade |
        ------------        -------------------------
        Student 4   ->      | grade | grade | grade |
        ------------        -------------------------
        Student 5   ->      | grade | grade | grade |
        ------------        -------------------------
        
        -------------------------
        | sub1 | sub2 | sub3 |
        -------------------------
        | sub1 | sub2 | sub3 |
        -------------------------
        | sub1 | sub2 | sub3 |
        -------------------------
        | sub1 | sub2 | sub3 |
        -------------------------
        | sub1 | sub2 | sub3 |
        -------------------------
        */
        
        // input for subjects to be stored in the array
        for (int i = 0; i < 3; i++){
            System.out.print("Enter the subject " + (i+1) + ": ");
            subjects[i] = Obj.nextLine();
        }
        
        // input for student name and grades
        for (int stud = 0; stud < 5; stud++){
            System.out.print("\nEnter the name of student " + (stud+1) + ": ");
            students[stud] = Obj.next(); // student name input
            for (int num = 0; num < 3;num++){ // loops columns
                System.out.print("\tEnter " + subjects[num] + " grade of " + students[stud] + ": ");
                grades[stud][num] = Obj.nextDouble(); // grade input
            }
        }
        
        
        // calculates for the total value of all 
        for (int row = 0; row < 5; row++){ // loops rows
            for (int col = 0; col < 3;col++){ // loops columns
                totalAll += grades[row][col]; // gets the total grade of all students
                TotalIndividual[row] += grades[row][col]; // gets the total grade for student
            }
        }
        
        for(int i = 0; i < 5; i++){
            averageIndividual[i] = TotalIndividual[i] / 3; // gets the average of each student
        }
        
        averageAll = totalAll / 15; // gets the total average of all students
        
        // prints the average of each student
        for (int i = 0; i < 5; i++){
            System.out.print("\nAverage grade of " + students[i] + ": " + averageIndividual[i]);
        }
        
        System.out.print("\nAverage of all students: " + averageAll); // prints the total average of all students
    }
}