import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class CourseFeeApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Course Fee Selector");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Courses and their fees
        String[] courses = {"Java Programming", "Python Programming", "Web Development", "Data Science"};
        HashMap<String, Integer> courseFees = new HashMap<>();
        courseFees.put("Java Programming", 5000);
        courseFees.put("Python Programming", 4500);
        courseFees.put("Web Development", 4000);
        courseFees.put("Data Science", 6000);

        // GUI components
        JComboBox<String> courseBox = new JComboBox<>(courses);
        JTextField feeField = new JTextField(10);
        feeField.setEditable(false);
        feeField.setText("0"); // default fee

        // Handle selection
        courseBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCourse = (String) courseBox.getSelectedItem();
                int fee = courseFees.get(selectedCourse);
                feeField.setText(String.valueOf(fee));
            }
        });

        frame.add(new JLabel("Select Course:"));
        frame.add(courseBox);
        frame.add(new JLabel("Course Fee:"));
        frame.add(feeField);

        frame.setVisible(true);
    }
}
