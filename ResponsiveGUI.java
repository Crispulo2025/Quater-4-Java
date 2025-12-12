import javax.swing.*;
import java.awt.*;

public class ResponsiveGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Responsive GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- Top Panel: Labels and TextFields using GridBagLayout -----
        JPanel topPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0; // makes components expand horizontally

        // Row 1: Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        topPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        topPanel.add(new JTextField(15), gbc);

        // Row 2: Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        topPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        topPanel.add(new JTextField(15), gbc);

        // Row 3: Age
        gbc.gridx = 0;
        gbc.gridy = 2;
        topPanel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        topPanel.add(new JTextField(5), gbc);

        // ----- Bottom Panel: Buttons using FlowLayout -----
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        bottomPanel.add(submitButton);
        bottomPanel.add(cancelButton);

        // Set buttons to expand proportionally
        submitButton.setPreferredSize(new Dimension(100, 30));
        cancelButton.setPreferredSize(new Dimension(100, 30));

        // ----- Add panels to frame -----
        frame.add(topPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
