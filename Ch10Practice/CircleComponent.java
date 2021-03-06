import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleComponent extends JComponent {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private int X = 0;
    private int Y = 0;
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;
    
    public CircleComponent(){
        ClickListener listener = new ClickListener();
        this.addMouseListener(listener);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        if(x1 == 0 && y1 == 0 && X != 0 && Y != 0){
            x1 = X;
            y1 = Y;
            X = 0;
            Y = 0;
        }
        if(x2 == 0 && y2 == 0 && X != 0 && Y != 0){
            x2 = X;
            y2 = Y;
            X = 0;
            Y = 0;
        }
        if(x1 != 0 && y1 != 0){
            Ellipse2D.Double dot = new Ellipse2D.Double(x1-10, y1-10, 20, 20);
            g2.fill(dot);
        }
        if(x2 != 0 && y2 != 0){
            Ellipse2D.Double dot = new Ellipse2D.Double(x2-10, y2-10, 20, 20);
            g2.fill(dot);
            Line2D.Double line1 = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line1);
            double r = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            Ellipse2D.Double circle = new Ellipse2D.Double(x1-r, y1-r, 2*r, 2*r);
            g2.draw(circle);
        }
    }
    
    public class ClickListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            X = e.getX();
            Y = e.getY();
            repaint();
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
    }

}