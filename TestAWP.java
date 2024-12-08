package activity.testawp;
import java.awt.*;
import javax.swing.*;
public class TestAWP extends Canvas{

    public void paint (Graphics g){
        Polygon triangle1 = new Polygon();
        Polygon triangle2 = new Polygon();

        g.setColor(Color.BLACK);
        g.fillOval(200, 200, 250, 250);
        g.fillOval(650, 200, 250, 250);
        g.fillOval(300, 300, 500, 500);
        
        g.setColor(Color.RED);
        g.fillArc(400, 450, 50, 75, 0, 180);
        g.fillArc(450, 450, 50, 75, 0, 180);
        g.fillArc(600, 450, 50, 75, 0, 180);
        g.fillArc(650, 450, 50, 75, 0, 180);
        
        triangle1.addPoint(400, 487);
        triangle1.addPoint(500, 487);
        triangle1.addPoint(450, 560);
        g.fillPolygon(triangle1);
        
        triangle2.addPoint(600, 487);
        triangle2.addPoint(700, 487);
        triangle2.addPoint(650, 560);
        g.fillPolygon(triangle2);
        
        g.setColor(Color.WHITE);
        g.fillArc(400, 600, 300, 40, 0, -180);
        
        g.setColor(Color.BLACK);
        g.drawString("By: Karl Prinze Wendel F. Valera", 250, 800);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Crazy Mickey");
        TestAWP canvas = new TestAWP();
        
        frame.setSize(500, 600);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
