package activity.awt;
import java.awt.*;
import javax.swing.*;
public class AWT extends Canvas{
    
    public void paint (Graphics g){
        
        g.setColor(Color.GREEN);
        g.drawRect(50, 50, 150, 100);
        g.fillRect(250, 50, 150, 100);
        
        g.setColor(Color.RED);
        g.drawOval(450, 50, 150, 100);
        g.fillOval(650, 50, 150, 100);
        
        g.setColor(Color.BLACK);
        g.drawLine(50, 200, 800, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes Example");
        AWT canvas = new AWT();
        
        frame.setSize(500, 600);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
