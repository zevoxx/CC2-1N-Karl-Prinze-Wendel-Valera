package activity.drawingcanvas;
import java.awt.*;
import javax.swing.*;
public class DrawingCanvas extends Canvas{


    public void paint (Graphics g){
        g.drawString("By: Karl Prinze Wendel F. Valera", 250, 800);
        /*
        for (int i = 100; i <= 700; i=i+10){
            for (int j = 5; j <= 600; j=j+10){
                g.drawLine(350, 300, i, j);    
            }
        }
        */
        
        
        int y = 600;
        for (int x = 700; x <= 800; x=x+4){
            y = y-2;
            g.drawLine(900, 700, x, y);    
        }
        
        y = 500;
        for (int x = 900; x >= 800; x=x-4){
            y = y-2;
            g.drawLine(700, 600, x, y);    
        }
        
        y = 400;
        for (int x = 700; x <= 800; x=x+4){
            y = y-2;
            g.drawLine(900, 500, x, y);    
        }
        
        y = 300;
        for (int x = 900; x >= 800; x=x-4){
            y = y-2;
            g.drawLine(700, 400, x, y);    
        }
        
        y = 200;
        for (int x = 700; x <= 800; x=x+4){
            y = y-2;
            g.drawLine(900, 300, x, y);    
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nov 26");
        DrawingCanvas canvas = new DrawingCanvas();
        
        frame.setSize(600, 600);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
