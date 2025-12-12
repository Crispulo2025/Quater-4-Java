import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> todoList;
    private JTextField taskField;

    public ToDoListGUI() {
        // Frame properties
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        // Top panel: JTextField + Add button
        JPanel topPanel = new JPanel(new BorderLayout(5, 5));
        taskField = new JTextField();
        JButton addButton = new JButton("Add");
        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // Center panel: JList inside JScrollPane
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(todoList);
        add(scrollPane, BorderLayout.CENTER);

        // Bottom panel: Remove and Clear buttons
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton removeButton = new JButton("Remove");
        JButton clearButton = new JButton("Clear");
        bottomPanel.add(removeButton);
        bottomPanel.add(clearButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Action listeners
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = todoList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        clearButton.addActionListener(e -> listModel.clear());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ToDoListGUI().setVisible(true);
        });
    }
}
