import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TableAddRowExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Add Row Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columns = {"Student Name", "Grade"};

        // Table model (allows adding rows)
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        // Sample initial data
        model.addRow(new Object[]{"Juan Dela Cruz", 90});
        model.addRow(new Object[]{"Maria Reyes", 88});

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Button to add a new row
        JButton addButton = new JButton("Add Row");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Example: add a default empty row
                model.addRow(new Object[]{"New Student", 0});
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(addButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
