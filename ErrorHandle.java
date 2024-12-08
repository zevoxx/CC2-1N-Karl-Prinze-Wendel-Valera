package activity.errorhandle;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;
public class ErrorHandle {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        
        double result = 0;
        try{
            System.out.print("Enter first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
            result = num1/num2;
        }
        catch(ArithmeticException ae){
            System.out.println("MATH ERROR: Cannot divide by zero");
        }
        catch(InputMismatchException ime){
            System.out.println("INPUT ERROR: User input is not a number");
        }
        finally{
            System.out.println("The result is: " + result);
        }
        String [] names = {"Anna", "Fe", "Maria", "Grant", "Sandra"};
        try{
            for(int ctr = 0; ctr <= names.length; ctr++){
                System.out.println(names[ctr] + "\t");
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe){ 
            System.out.println("ARRAY ERROR: OUT OF BOUNDS");
        }
        
        /*
        int ctr = 0;
        String [] names = {"Anna", "Fe", "Maria", "Grant", "Sandra"};
        try{
            for(ctr = 0; ctr <= names.length; ctr++){
                System.out.println(names[ctr] + "\t");
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe){ 
            System.out.println("ARRAY ERROR: OUT OF BOUNDS");
        }
        finally{
            System.out.println(names[ctr] + "\t");
        }
        */
    } 
}
