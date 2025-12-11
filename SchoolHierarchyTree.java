import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;

public class SchoolHierarchyTree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("School Hierarchy");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Root node: Principal
        DefaultMutableTreeNode principal = new DefaultMutableTreeNode("Principal");

        // Departments
        DefaultMutableTreeNode mathDept = new DefaultMutableTreeNode("Math Department");
        mathDept.add(new DefaultMutableTreeNode("Mr. Santos"));
        mathDept.add(new DefaultMutableTreeNode("Ms. Reyes"));

        DefaultMutableTreeNode sciDept = new DefaultMutableTreeNode("Science Department");
        sciDept.add(new DefaultMutableTreeNode("Dr. Cruz"));
        sciDept.add(new DefaultMutableTreeNode("Ms. Lopez"));

        DefaultMutableTreeNode engDept = new DefaultMutableTreeNode("English Department");
        engDept.add(new DefaultMutableTreeNode("Mr. Villanueva"));
        engDept.add(new DefaultMutableTreeNode("Ms. Garcia"));

        // Add departments to principal
        principal.add(mathDept);
        principal.add(sciDept);
        principal.add(engDept);

        // Create JTree
        JTree tree = new JTree(principal);

        // Label to show selected node
        JLabel selectedLabel = new JLabel("Selected: None");

        // Add TreeSelectionListener
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                        tree.getLastSelectedPathComponent();
                if (node != null) {
                    selectedLabel.setText("Selected: " + node.toString());
                }
            }
        });

        frame.add(new JScrollPane(tree), BorderLayout.CENTER);
        frame.add(selectedLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
