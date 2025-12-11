import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SubjectSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Subject Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Subjects for the JList
        String[] subjects = {
            "Math", "Science", "English", "Filipino", 
            "History", "PE", "Computer", "Art"
        };

        // Create JList
        JList<String> subjectList = new JList<>(subjects);
        subjectList.setVisibleRowCount(5);
        subjectList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(subjectList);

        // TextField to display selected subjects
        JTextField outputField = new JTextField(25);
        outputField.setEditable(false);

        // Button to show selections
        JButton showButton = new JButton("Show Selected Subjects");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> selected = subjectList.getSelectedValuesList();

                if (selected.isEmpty()) {
                    outputField.setText("No subjects selected.");
                } else {
                    outputField.setText(String.join(", ", selected));
                }
            }
        });

        // Add components
        frame.add(scrollPane);
        frame.add(showButton);
        frame.add(outputField);

        frame.setVisible(true);
    }
}
