package activity.additioncalculator;
import javax.swing.JOptionPane;
public class AdditionCalculator {
    public static void main(String[] args) {
        // Prompt the user to enter the first number
        String firstNumber = JOptionPane.showInputDialog(null, "Enter the first number","input",JOptionPane.QUESTION_MESSAGE);
        // Prompt the user to enter the second number
        String secondNumber = JOptionPane.showInputDialog(null, "Enter the second number","input",JOptionPane.QUESTION_MESSAGE);
        // Convert the input strings to integers
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        // Perform the addition
        int sum =  num1 + num2;
        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
