import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task Selector");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Tasks array
        String[] tasks = {"Study Java", "Exercise", "Read Book", "Grocery Shopping", "Clean Room"};

        // Create JList with multiple selection enabled
        JList<String> taskList = new JList<>(tasks);
        taskList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setPreferredSize(new Dimension(200, 100));

        // Button to show selected tasks
        JButton showButton = new JButton("Show Selected Tasks");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> selectedTasks = taskList.getSelectedValuesList();
                if (selectedTasks.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No tasks selected.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Selected tasks:\n" + String.join("\n", selectedTasks));
                }
            }
        });

        // Add components to frame
        frame.add(scrollPane);
        frame.add(showButton);

        frame.setVisible(true);
    }
}
