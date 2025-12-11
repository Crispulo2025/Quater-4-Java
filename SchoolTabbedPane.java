import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SchoolTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("School Tabs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // -------------------- Students Tab --------------------
        JPanel studentsPanel = new JPanel();
        studentsPanel.setLayout(new FlowLayout());
        studentsPanel.add(new JLabel("Student Name:"));
        JTextField studentField = new JTextField(15);
        studentsPanel.add(studentField);
        JButton addStudentBtn = new JButton("Add Student");
        studentsPanel.add(addStudentBtn);

        addStudentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Student added: " + studentField.getText());
            }
        });

        // -------------------- Teachers Tab --------------------
        JPanel teachersPanel = new JPanel();
        teachersPanel.setLayout(new FlowLayout());
        teachersPanel.add(new JLabel("Teacher Name:"));
        JTextField teacherField = new JTextField(15);
        teachersPanel.add(teacherField);
        JButton addTeacherBtn = new JButton("Add Teacher");
        teachersPanel.add(addTeacherBtn);

        addTeacherBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Teacher added: " + teacherField.getText());
            }
        });

        // -------------------- Courses Tab --------------------
        JPanel coursesPanel = new JPanel();
        coursesPanel.setLayout(new FlowLayout());
        coursesPanel.add(new JLabel("Select Course:"));
        String[] courses = {"Math", "Science", "English", "History"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        coursesPanel.add(courseBox);
        JButton selectCourseBtn = new JButton("Confirm");
        coursesPanel.add(selectCourseBtn);

        selectCourseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Course selected: " + courseBox.getSelectedItem());
            }
        });

        // Add panels to tabs
        tabbedPane.addTab("Students", studentsPanel);
        tabbedPane.addTab("Teachers", teachersPanel);
        tabbedPane.addTab("Courses", coursesPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
