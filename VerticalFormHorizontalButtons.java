import javax.swing.*;
import java.awt.*;

public class VerticalFormHorizontalButtons {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Form with Vertical Fields and Horizontal Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // Main panel with BoxLayout on Y-axis for vertical stacking
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Input field 1
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1.add(new JLabel("First Name:"));
        panel1.add(new JTextField(20));
        mainPanel.add(panel1);

        // Input field 2
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("Last Name:"));
        panel2.add(new JTextField(20));
        mainPanel.add(panel2);

        // Input field 3
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(new JLabel("Email:"));
        panel3.add(new JTextField(20));
        mainPanel.add(panel3);

        // Horizontal buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.add(new JButton("Submit"));
        buttonPanel.add(new JButton("Cancel"));
        mainPanel.add(buttonPanel);

        // Add main panel to frame
        frame.add(mainPanel);

        // Make frame visible
        frame.setVisible(true);
    }
}
