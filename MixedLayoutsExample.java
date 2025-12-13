import javax.swing.*;
import java.awt.*;

public class MixedLayoutsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mixed Layouts Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // NORTH panel with BoxLayout (X_AXIS)
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
        northPanel.add(new JButton("File"));
        northPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        northPanel.add(new JButton("Edit"));
        northPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        northPanel.add(new JButton("View"));
        mainPanel.add(northPanel, BorderLayout.NORTH);

        // CENTER panel with GridLayout (2 rows x 3 columns)
        JPanel centerPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            centerPanel.add(new JButton("Button " + i));
        }
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // SOUTH panel with BoxLayout (X_AXIS)
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.X_AXIS));
        southPanel.add(Box.createHorizontalGlue());
        southPanel.add(new JButton("OK"));
        southPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        southPanel.add(new JButton("Cancel"));
        southPanel.add(Box.createHorizontalGlue());
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
