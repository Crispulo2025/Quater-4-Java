import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class RadioButtonGroupExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("JRadioButton Group Example");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create label
        JLabel label = new JLabel("Select a option:");

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        // Add action listeners to update label
        option1.addActionListener(e -> label.setText("Selected: Option 1"));
        option2.addActionListener(e -> label.setText("Selected: Option 2"));
        option3.addActionListener(e -> label.setText("Selected: Option 3"));

        // Add components to frame
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(label);

        // Frame settings
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}