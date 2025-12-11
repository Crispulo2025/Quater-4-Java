import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TableFilterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Filter Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columns = {"Item", "Category", "Price"};

        // Table model
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        // Sample data
        model.addRow(new Object[]{"Laptop", "Electronics", 50000});
        model.addRow(new Object[]{"Mouse", "Electronics", 500});
        model.addRow(new Object[]{"Notebook", "Stationery", 50});
        model.addRow(new Object[]{"Pen", "Stationery", 20});
        model.addRow(new Object[]{"Headphones", "Electronics", 2000});

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // ComboBox for categories
        String[] categories = {"All", "Electronics", "Stationery"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        // Button to filter table
        JButton filterButton = new JButton("Filter");

        filterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) categoryBox.getSelectedItem();

                // Clear table
                model.setRowCount(0);

                // Re-add rows matching the selected category
                Object[][] allData = {
                    {"Laptop", "Electronics", 50000},
                    {"Mouse", "Electronics", 500},
                    {"Notebook", "Stationery", 50},
                    {"Pen", "Stationery", 20},
                    {"Headphones", "Electronics", 2000}
                };

                for (Object[] row : allData) {
                    if (selectedCategory.equals("All") || row[1].equals(selectedCategory)) {
                        model.addRow(row);
                    }
                }
            }
        });

        // Panel for controls
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(new JLabel("Select Category:"));
        controlPanel.add(categoryBox);
        controlPanel.add(filterButton);

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
