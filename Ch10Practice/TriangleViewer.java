import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class TriangleViewer {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    JFrame frame;

    public TriangleViewer() {
        JFrame frame = new JFrame();

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TriangleComponent component = new TriangleComponent();
        
        frame.add(component);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TriangleViewer viewer = new TriangleViewer();
    }
}