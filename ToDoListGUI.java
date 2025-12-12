import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- Top Panel: Input field and Add button -----
        JPanel topPanel = new JPanel(new FlowLayout());
        JTextField taskField = new JTextField(20);
        JButton addButton = new JButton("Add");
        topPanel.add(taskField);
        topPanel.add(addButton);

        // ----- Center Panel: JList inside JScrollPane -----
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // ----- Bottom Panel: Remove and Clear buttons -----
        JPanel bottomPanel = new JPanel(new FlowLayout());
        JButton removeButton = new JButton("Remove");
        JButton clearButton = new JButton("Clear");
        bottomPanel.add(removeButton);
        bottomPanel.add(clearButton);

        // ----- Add panels to frame -----
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // ----- Add button functionality -----
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        // ----- Remove button functionality -----
        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        // ----- Clear button functionality -----
        clearButton.addActionListener(e -> listModel.clear());

        // Make frame visible
        frame.setVisible(true);
    }
}
