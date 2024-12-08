package activity.ifelselabdrill;
import java.util.Scanner;
public class IfElseLabDrill 
{
    public static void main(String[] args) 
    {
        System.out.println("KPWFV's Grade checker");
            Scanner Obj = new Scanner(System.in); 
            System.out.print("\nEnter Exam Score: ");
            double score = Obj.nextDouble();
        
            if (score <= 59) 
                {
                System.out.print("Your grade is F");
                }
                    
            else if (score <= 69) 
                {
                System.out.print("Your grade is D");
                }
            else if (score <= 79) 
                {
                System.out.print("Your grade is C");
                 }
            else if (score <= 89) 
                {
                System.out.print("Your grade is B");
                }
            else if(score <= 100)
                {
                System.out.print("Your grade is A");
                }
            else 
            {
                System.out.print("Your grade is not defined");
            }
    }   
}
