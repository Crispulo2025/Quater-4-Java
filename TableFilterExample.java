import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableFilterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Filtering Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLayout(new BorderLayout());

        // Table Data
        String[] columns = {"Product", "Category", "Price"};
        Object[][] data = {
            {"Laptop", "Electronics", 45000},
            {"Smartphone", "Electronics", 25000},
            {"Bananas", "Food", 80},
            {"Bread", "Food", 50},
            {"T-shirt", "Clothing", 350},
            {"Jeans", "Clothing", 900}
        };

        // Create table model + table
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);

        // Wrap table in scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // ComboBox for filtering
        String[] categories = {"All", "Electronics", "Food", "Clothing"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        // Panel for combobox
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Filter by Category:"));
        topPanel.add(categoryBox);

        // Add filter listener
        categoryBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) categoryBox.getSelectedItem();

                TableRowSorter<DefaultTableModel> sorter =
                        new TableRowSorter<>(model);
                table.setRowSorter(sorter);

                if (selected.equals("All")) {
                    sorter.setRowFilter(null); // remove filter
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(selected, 1));
                }
            }
        });

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
