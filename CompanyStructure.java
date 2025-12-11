import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;

public class CompanyStructure {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Company Structure");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Root node: Company
        DefaultMutableTreeNode company = new DefaultMutableTreeNode("ABC Corp");

        // Departments
        DefaultMutableTreeNode hrDept = new DefaultMutableTreeNode("HR Department");
        hrDept.add(new DefaultMutableTreeNode("Alice - HR Manager"));
        hrDept.add(new DefaultMutableTreeNode("Bob - HR Assistant"));

        DefaultMutableTreeNode itDept = new DefaultMutableTreeNode("IT Department");
        itDept.add(new DefaultMutableTreeNode("Charlie - IT Manager"));
        itDept.add(new DefaultMutableTreeNode("David - Software Engineer"));

        DefaultMutableTreeNode salesDept = new DefaultMutableTreeNode("Sales Department");
        salesDept.add(new DefaultMutableTreeNode("Eve - Sales Manager"));
        salesDept.add(new DefaultMutableTreeNode("Frank - Sales Executive"));

        // Add departments to company
        company.add(hrDept);
        company.add(itDept);
        company.add(salesDept);

        // Create JTree
        JTree tree = new JTree(company);

        // Label to show selected employee
        JLabel selectedLabel = new JLabel("Selected: None");

        // Add TreeSelectionListener
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                        tree.getLastSelectedPathComponent();
                if (node != null && node.isLeaf()) { // only show leaf nodes (employees)
                    selectedLabel.setText("Selected: " + node.toString());
                }
            }
        });

        frame.add(new JScrollPane(tree), BorderLayout.CENTER);
        frame.add(selectedLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
