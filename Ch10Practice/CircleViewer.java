import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class CircleViewer {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    JFrame frame;

    public CircleViewer() {
        JFrame frame = new JFrame();

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CircleComponent component = new CircleComponent();
        
        frame.add(component);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        CircleViewer viewer = new CircleViewer();
    }
}