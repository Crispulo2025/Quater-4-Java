import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductTable {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Product Cost Calculator");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Table data
        String[][] data = {
            {"Notebook", "50", "3"},
            {"Ballpen", "12", "10"},
            {"Calculator", "450", "1"},
            {"Marker", "30", "5"},
            {"Pad Paper", "40", "2"}
        };

        // Table headers
        String[] columns = {"Product", "Price", "Quantity"};

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);

        // Label for total cost
        JLabel totalLabel = new JLabel("Total Cost: ₱0.00");

        // Button to calculate total
        JButton calcButton = new JButton("Calculate Total");

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;

                for (int i = 0; i < table.getRowCount(); i++) {
                    double price = Double.parseDouble(table.getValueAt(i, 1).toString());
                    int qty = Integer.parseInt(table.getValueAt(i, 2).toString());
                    total += price * qty;
                }

                totalLabel.setText("Total Cost: ₱" + total);
            }
        });

        // Bottom panel (button + label)
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(calcButton);
        bottomPanel.add(totalLabel);

        // Add components to frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
