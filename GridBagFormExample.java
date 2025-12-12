import javax.swing.*;
import java.awt.*;

public class GridBagFormExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridBag Form Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ----- Row 1: Name -----
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JTextField(15), gbc);

        // ----- Row 2: Age -----
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Age:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JTextField(5), gbc);

        // ----- Row 3: Email -----
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JTextField(15), gbc);

        // ----- Submit Button centered below fields -----
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // span both columns
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }
}
