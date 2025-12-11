import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileSystemTree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File System JTree");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Root folder
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("MyFiles");

        // Folder 1
        DefaultMutableTreeNode folder1 = new DefaultMutableTreeNode("Documents");
        folder1.add(new DefaultMutableTreeNode("resume.docx"));
        folder1.add(new DefaultMutableTreeNode("report.pdf"));

        // Folder 2
        DefaultMutableTreeNode folder2 = new DefaultMutableTreeNode("Pictures");
        folder2.add(new DefaultMutableTreeNode("photo1.jpg"));
        folder2.add(new DefaultMutableTreeNode("photo2.png"));

        // Folder 3
        DefaultMutableTreeNode folder3 = new DefaultMutableTreeNode("Music");
        folder3.add(new DefaultMutableTreeNode("song1.mp3"));
        folder3.add(new DefaultMutableTreeNode("song2.wav"));

        // Add folders to root
        root.add(folder1);
        root.add(folder2);
        root.add(folder3);

        // Create JTree
        JTree tree = new JTree(root);

        // Add to frame
        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}
