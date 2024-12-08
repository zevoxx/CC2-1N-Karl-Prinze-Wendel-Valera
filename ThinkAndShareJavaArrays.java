// Think and Share - Exploring Java Arrays
// Arrays October 29, 2024
package activity.thinkandsharejavaarrays;
import java.util.Scanner;
import java.util.Arrays;
public class ThinkAndShareJavaArrays {

    static void example1(){
        Scanner Obj = new Scanner(System.in);
        System.out.println("\"Real life example: Music player\"");
        System.out.println("List of Songs");
        String[] favSongs = new String[4];
        favSongs[0] = "abc song";
        favSongs[1] = "birthday song";
        favSongs[2] = "twinkle twinkle";
        favSongs[3] = "london bridge";
        System.out.println("0 " + favSongs[0]);
        System.out.println("1 " + favSongs[1]);
        System.out.println("2 " + favSongs[2]);
        System.out.println("3 " + favSongs[3]);
        System.out.print("Choose what song to play (type the number):");
        int choice = Obj.nextInt();
        System.out.println("Now playing: " + favSongs[choice]);    
    }
    static void example2(){
        Scanner Obj = new Scanner(System.in);
        System.out.println("\n\"Real life example: Bank Systems\"");
        System.out.println("List of your accounts");
        double[] accBalance = new double[4];
        accBalance[0] = 8000;
        accBalance[1] = 900.50;
        accBalance[2] = 7500;
        accBalance[3] = 600.75;
        System.out.println("Balance of Account Profile 0: " + accBalance[0]);
        System.out.println("Balance of Account Profile 1: " + accBalance[1]);
        System.out.println("Balance of Account Profile 2: " + accBalance[2]);
        System.out.println("Balance of Account Profile 3: " + accBalance[3]);
        System.out.print("Which account do you want to use?:");
        int choiceAcc = Obj.nextInt();
        System.out.print("Withdraw or Deposit?:");
        String choice = Obj.next();
        if(choice.equalsIgnoreCase("Withdraw")){
            System.out.print("How much do you want to withdraw?:");
            double choiceWithdraw = Obj.nextDouble();
            if(choiceWithdraw>accBalance[choiceAcc]){
                System.out.println("You don't have that much money");
            }
            else{
                System.out.println("You have withdrawn " + choiceWithdraw);
                System.out.println("Your current balance is:  " + (accBalance[choiceAcc] - choiceWithdraw));
            }
        }
        else if(choice.equalsIgnoreCase("Deposit")){
            System.out.print("How much do you want to deposit?:");
            double choiceDeposit = Obj.nextDouble();
            System.out.println("You have deposited " + choiceDeposit);
            System.out.println("Your current balance is:  " + (accBalance[choiceAcc] + choiceDeposit));
        }
        else {
            System.out.println("That is not an option");
        }
        System.out.println("Thank you for visiting");
    }
    static void example3(){
        // create scanner if user input will be used instead of predefined
        // Scanner Obj = new Scanner(System.in);
        System.out.println("\n\"Real life example: Storing Patient Data\"");
        double[] temperature = new double[24];
        temperature[0] = 97;
        temperature[1] = 97.1;
        temperature[2] = 97.3;
        temperature[3] = 97.4;
        temperature[4] = 97.6;
        temperature[5] = 97.7;
        temperature[6] = 97.8;
        temperature[7] = 97.9;
        temperature[8] = 98;
        temperature[9] = 98.1;
        temperature[10] = 98.4;
        temperature[11] = 98.7;
        temperature[12] = 98.9;
        temperature[13] = 99;
        temperature[14] = 99.2;
        temperature[15] = 99.4;
        temperature[16] = 99.7;
        temperature[17] = 99.9;
        temperature[18] = 100;
        temperature[19] = 100.2;
        temperature[20] = 100.4;
        temperature[21] = 100.6;
        temperature[22] = 100.7;
        temperature[23] = 100.7;
        //This can also be used to input temperature
        /*
        for (int i = 0; i<24; i++){
            System.out.println("Enter patient's temperature hour " + (i+1) + ": ");
            double temp = Obj.nextDouble();   
            temperature[i] = temp;
        }
        */
        for (int i = 0; i<24; i++){
            System.out.println("Patient's temperature at hour " + (i+1) + " is: " + temperature[i]);
            if (temperature[i] >= 100.4){
                System.out.println("WARNING: PATIENT IS FEELING VERY BAD");
            }
        }
    }
    static void example4(){
        Scanner Obj = new Scanner(System.in);
        System.out.println("\n\"Real life example: Student Grades Application\"");
        double[] grades = new double[5];
        for (int i = 0; i<5; i++){
            System.out.print("Enter grade for student " + (i+1) + ": ");
            double temp = Obj.nextDouble();   
            grades [i] = temp;
        }
        double total = 0;
        for (int i = 0; i<5; i++){
            total += grades[i];
        }
        double average = total / grades.length;
        System.out.println("General Average: " + average);   
        Arrays.sort(grades);
        System.out.println("Lowest Grade: " + grades[0]); 
        System.out.println("Highest Grade: " + grades[grades.length-1]); 
    }
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }
}
