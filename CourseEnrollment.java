import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseEnrollment {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Course Enrollment");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Select a course:");

        // JComboBox with course options
        String[] courses = {"Mathematics", "Physics", "Chemistry", "Biology", "Computer Science"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        // JButton to enroll
        JButton enrollButton = new JButton("Enroll");

        // ActionListener for button
        enrollButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCourse = (String) courseBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "You have enrolled in: " + selectedCourse, 
                                              "Enrollment Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // JPanel to hold components
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(courseBox);
        panel.add(enrollButton);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
