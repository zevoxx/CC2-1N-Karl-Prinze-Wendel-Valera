package activity.gradeclassification;
import java.util.Scanner;
public class GradeClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Process grades for 5 students without using an array
        for (int i = 1; i <= 5; i++) {
            // Input the grade for each student
            System.out.print("Enter grade for student " + i + ": ");
            int grade = scanner.nextInt();  // nextInt instead of nextDouble

            // Classify the grade
            if (grade >= 90) {  // turned it to >= instead of >
                System.out.println("Student " + i + ": Excellent");
            } else if (grade >= 70 && grade <= 89) {  // used && instead or ||
                System.out.println("Student " + i + ": Good");
            } else if (grade >= 0 && grade <= 69) {  // used && instead or ||
                System.out.println("Student " + i + ": Needs Improvement"); // added semi colon
            } else {
                System.out.println("invalid input"); // for invalid inputs
                i--; 
            } 
        }
    }
}