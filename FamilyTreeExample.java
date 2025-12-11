import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;

public class FamilyTreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Family Tree");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Root: Grandparents
        DefaultMutableTreeNode grandparents = new DefaultMutableTreeNode("Grandparents");

        // Parents
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Father");
        parent1.add(new DefaultMutableTreeNode("Me"));
        parent1.add(new DefaultMutableTreeNode("Sibling"));

        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Mother");
        parent2.add(new DefaultMutableTreeNode("Cousin1"));
        parent2.add(new DefaultMutableTreeNode("Cousin2"));

        // Add parents to grandparents
        grandparents.add(parent1);
        grandparents.add(parent2);

        // Create JTree
        JTree tree = new JTree(grandparents);

        // JTextField to display selected member
        JTextField selectedField = new JTextField(25);
        selectedField.setEditable(false);

        // TreeSelectionListener
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                        tree.getLastSelectedPathComponent();
                if (node != null) {
                    selectedField.setText(node.toString());
                }
            }
        });

        frame.add(new JScrollPane(tree), BorderLayout.CENTER);
        frame.add(selectedField, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
