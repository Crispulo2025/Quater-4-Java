import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TabbedTextButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // -------------------- Panel 1: JTextArea --------------------
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea("Type something here...");
        textPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // -------------------- Panel 2: JButton --------------------
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me!");
        buttonPanel.add(button);

        // Optional: Add an action for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add panels to tabs
        tabbedPane.addTab("Text Area", textPanel);
        tabbedPane.addTab("Button", buttonPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
