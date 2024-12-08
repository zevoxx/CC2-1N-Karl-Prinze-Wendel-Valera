//By: Karl Prinze Wendel F Valera
//To: Ma'am Anna Rhodora M Quitaleg
//September 7, 2024 : 
//Laboratory challenge 2
//Interactive "with scanner"
package activity.labchallenge2;
import java.util.Scanner;
public class LabChallenge2 
{
    public static void main(String[] args) 
        {  
        //Calculator Brand
        System.out.println("\"KPWFV'S Contruction Company Area and Perimeter Calculator\"");    
        System.out.println("Unit of measurement implemented: Meters \n");
    
        Scanner Obj = new Scanner(System.in);
        
        //Declaration of double variables
        double length, width, area, perimeter;
        //Input for Length
        System.out.println("Enter Length="); 
        length = Obj.nextDouble();   
        
        //Input for Width
        System.out.println("Enter Width="); 
        width = Obj.nextDouble();      
        
        //Calculation for Area
        area = length * width;   
            
        //Calculation for Perimeter
        perimeter = 2 * (length + width);
    
        //Results
        System.out.println("\nGiven Measurement:");
        System.out.println("\tLength = " + length + " Meters");
        System.out.println("\tWidth = " + width + " Meters");
        System.out.println("\nComputed Answers For:");
        System.out.println("\tArea = " + area + " Meters² \"(squared)\"");
        System.out.println("\tPerimeter = " + perimeter + " Meters");
   
        //End of Code
        }
}

