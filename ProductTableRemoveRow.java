import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class ProductTableRemoveRow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Table - Remove Row");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columns = {"Product", "Quantity", "Price"};

        // Table model
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        // Sample data
        model.addRow(new Object[]{"Laptop", 5, 50000});
        model.addRow(new Object[]{"Mouse", 10, 500});
        model.addRow(new Object[]{"Keyboard", 7, 1200});
        model.addRow(new Object[]{"Monitor", 3, 8000});

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Panel for removing row
        JPanel removePanel = new JPanel();
        removePanel.setLayout(new FlowLayout());
        JTextField rowField = new JTextField(5);
        JButton removeButton = new JButton("Remove Row");

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int rowIndex = Integer.parseInt(rowField.getText());
                    if (rowIndex >= 0 && rowIndex < model.getRowCount()) {
                        model.removeRow(rowIndex);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid row index.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number.");
                }
            }
        });

        removePanel.add(new JLabel("Row index:"));
        removePanel.add(rowField);
        removePanel.add(removeButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(removePanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
