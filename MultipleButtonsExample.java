import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleButtonsExample implements ActionListener {

    // Create buttons
    JButton button1;
    JButton button2;
    JButton button3;

    public MultipleButtonsExample() {

        // Create JFrame
        JFrame frame = new JFrame("Multiple Buttons Example");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Initialize buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Exit");

        // Register single ActionListener
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Add buttons to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Single ActionListener handling all buttons
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(null, "Button 1 Clicked!");
        }

        else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(null, "Button 2 Clicked!");
        }

        else if (e.getSource() == button3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MultipleButtonsExample();
    }
}