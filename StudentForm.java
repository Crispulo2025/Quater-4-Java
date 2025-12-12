import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame {

    public StudentForm() {
        // Set frame properties
        setTitle("Student Information Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel with GridLayout (4 rows, 2 columns)
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10)); // 10px horizontal & vertical gaps

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel gradeLabel = new JLabel("Grade Level:");
        JTextField gradeField = new JTextField();

        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(gradeLabel);
        panel.add(gradeField);
        panel.add(new JLabel()); // empty placeholder to align button
        panel.add(submitButton);

        // Add panel to the frame
        add(panel);

        // Action listener for the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String grade = gradeField.getText();

                JOptionPane.showMessageDialog(null,
                        "Student Info:\nName: " + name + "\nAge: " + age + "\nGrade Level: " + grade);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StudentForm().setVisible(true);
        });
    }
}
