import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EditableTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Editable JTable Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Column names
        String[] columns = {"Item", "Quantity", "Price"};

        // Table model
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        // Sample data
        model.addRow(new Object[]{"Apple", 2, 50});
        model.addRow(new Object[]{"Banana", 3, 30});

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Label to show latest value of a specific cell
        JLabel cellLabel = new JLabel("Last Edited Cell: None");

        // Listen for table changes
        model.addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    Object value = model.getValueAt(row, column);
                    cellLabel.setText("Last Edited Cell [Row " + row + ", Col " + column + "]: " + value);
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(cellLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
