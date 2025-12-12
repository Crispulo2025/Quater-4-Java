import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        // Set frame properties
        setTitle("BorderLayout Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set BorderLayout
        setLayout(new BorderLayout(10, 10)); // 10px gaps between regions

        // NORTH → Header label
        JLabel headerLabel = new JLabel("Header", SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);

        // WEST → JList with 5 items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> itemList = new JList<>(items);
        add(new JScrollPane(itemList), BorderLayout.WEST);

        // CENTER → JTextArea
        JTextArea textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // EAST → Options button
        JButton optionsButton = new JButton("Options");
        add(optionsButton, BorderLayout.EAST);

        // SOUTH → Status label
        JLabel statusLabel = new JLabel("Status", SwingConstants.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BorderLayoutExample().setVisible(true);
        });
    }
}
