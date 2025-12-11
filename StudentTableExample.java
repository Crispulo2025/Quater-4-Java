import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentTableExample {
    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Student Grades");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Table data
        String[][] data = {
            {"Juan Dela Cruz", "92"},
            {"Maria Reyes", "88"},
            {"Pedro Santos", "95"},
            {"Ana Lopez", "90"},
            {"Mark Villanueva", "85"}
        };

        // Column names
        String[] columnNames = { "Student Name", "Grade" };

        // Create JTable
        JTable table = new JTable(data, columnNames);

        // Add table inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Display the window
        frame.setVisible(true);
    }
}
