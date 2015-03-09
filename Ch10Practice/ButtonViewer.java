import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class ButtonViewer{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    JFrame frame;
    JPanel panel;
    JButton buttonA, buttonB;
    JLabel label;

    public ButtonViewer(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        panel.add(buttonA);
        panel.add(buttonB);

        JLabel label = new JLabel("No Button Clicked");
        panel.add(label);

        frame.add(panel);

        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            label.setText(event.getActionCommand());         
        }
    }
    
    public static void main(String[] args){
        ButtonViewer viewer = new ButtonViewer();
    }
}
