import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Components
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(20);

        JLabel gradeLabel = new JLabel("Grade Level:");
        String[] grades = {"Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12"};
        JComboBox<String> gradeBox = new JComboBox<>(grades);

        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton addButton = new JButton("Add Student");

        // Button Action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String grade = (String) gradeBox.getSelectedItem();

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a student name.");
                    return;
                }

                outputArea.append(name + " – " + grade + "\n");
                nameField.setText("");
                nameField.requestFocus();
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(gradeLabel);
        frame.add(gradeBox);
        frame.add(addButton);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
