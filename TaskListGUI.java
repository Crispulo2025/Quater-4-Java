import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskListGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // TextField for entering tasks
        JTextField taskField = new JTextField(20);

        // Buttons
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Selected");

        // JList + Model
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        taskList.setVisibleRowCount(8);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add task button action
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    taskField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a task.");
                }
            }
        });

        // Remove task button action
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(frame, "Select a task to remove.");
                }
            }
        });

        // Add components to frame
        frame.add(new JLabel("Enter Task:"));
        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
