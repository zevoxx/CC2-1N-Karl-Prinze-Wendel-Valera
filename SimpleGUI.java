package activity.simplegui;
import javax.swing.JOptionPane;
public class SimpleGUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter you name");
        String birthYear = JOptionPane.showInputDialog(null, "Enter your year of birth");
        int bYear = Integer.parseInt(birthYear);
        int currentYear = 2024;
        int age = currentYear - bYear;
        JOptionPane.showMessageDialog(null, "Hello " + name + ", you are " + age + " years old.");
    }
}
