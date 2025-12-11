import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TableTotalPrice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Total Price Calculator");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columns = {"Item", "Quantity", "Price"};

        // Table model
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        // Sample data
        model.addRow(new Object[]{"Apples", 2, 50});
        model.addRow(new Object[]{"Bananas", 3, 30});
        model.addRow(new Object[]{"Oranges", 1, 40});

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Button to calculate total
        JButton totalButton = new JButton("Calculate Total");
        JLabel totalLabel = new JLabel("Total Price: 0");

        totalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                for (int i = 0; i < model.getRowCount(); i++) {
                    int quantity = Integer.parseInt(model.getValueAt(i, 1).toString());
                    double price = Double.parseDouble(model.getValueAt(i, 2).toString());
                    total += quantity * price;
                }
                totalLabel.setText("Total Price: " + total);
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(totalButton);
        bottomPanel.add(totalLabel);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
