import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseForm extends JFrame {

    public CourseForm() {
        // Frame properties
        setTitle("Course Details Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with GridBagLayout for flexible layout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // padding around panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels and text fields
        JLabel codeLabel = new JLabel("Course Code:");
        JTextField codeField = new JTextField(10);

        JLabel nameLabel = new JLabel("Course Name:");
        JTextField nameField = new JTextField(15);

        JLabel unitsLabel = new JLabel("Units:");
        JTextField unitsField = new JTextField(5);

        JButton submitButton = new JButton("Submit");

        // Add components to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(codeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(codeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(unitsLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(unitsField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // span two columns for button
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        // Action listener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = codeField.getText();
                String name = nameField.getText();
                String units = unitsField.getText();

                JOptionPane.showMessageDialog(null,
                        "Course Code: " + code + "\nCourse Name: " + name + "\nUnits: " + units);
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CourseForm().setVisible(true);
        });
    }
}
