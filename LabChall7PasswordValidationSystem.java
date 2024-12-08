//by: Karl Prinze Wendel F Valera
//to: Ma'am Anna Rhodora M Quitaleg
//Lab Challenge 7: Password Validation System
package activity.labchall7passwordvalidationsystem;
import java.util.Scanner;
public class LabChall7PasswordValidationSystem {

    public static void main(String[] args) 
    {
        Scanner Obj = new Scanner(System.in);
        System.out.println("KPWFV'S PASSWORD VALIDATION SYSTEM");
        int upperCaseLetterAmount, numAmountOfPass, i; // declaration of variables
        while (true)
        {
            upperCaseLetterAmount = 0;
            numAmountOfPass = 0;
            System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            System.out.print("Enter your password: ");
            String userPassword = Obj.nextLine(); // user input
            for (i= 0 ;i < userPassword.length(); i++)
                {
                char bitCheck = userPassword.charAt(i); // reads every bit of user input
                if (Character.isUpperCase(bitCheck)) // checks if there is a capital letter
                {
                    upperCaseLetterAmount++;//adds to variable upperCaseLetterAmount if there is a capital letter
                }
                else if (Character.isDigit(bitCheck)) // checks if there is a number
                {
                    numAmountOfPass++; //adds to variable numAmountOfPass if there is a digit
                }
                }
            if (upperCaseLetterAmount > 0 && numAmountOfPass > 0 && i > 8) // stops loop if these requirements are met
                {
                break;
                }
        }
        System.out.println("Your password is valid!"); 
    }
}
/* 
    ".matches()" 
*/


