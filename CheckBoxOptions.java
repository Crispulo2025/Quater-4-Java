import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class CheckBoxOptions {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("JCheckBox Example");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create JCheckBoxes
        JCheckBox option1 = new JCheckBox("Option 1");
        JCheckBox option2 = new JCheckBox("Option 2");
        JCheckBox option3 = new JCheckBox("Option 3");

        // Create JButton
        JButton button = new JButton("Show Selected");

        // Button click event
        button.addActionListener(e -> {

            System.out.println("Selected Options:");

            if (option1.isSelected()) {
                System.out.println("Option 1");
            }

            if (option2.isSelected()) {
                System.out.println("Option 2");
            }

            if (option3.isSelected()) {
                System.out.println("Option 3");
            }
        });

        // Add components
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(button);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}