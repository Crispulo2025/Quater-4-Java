import javax.swing.*;
import java.awt.*;

public class LayoutComparison {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("FlowLayout vs GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Main panel with GridLayout (2 rows x 1 column)
        JPanel mainPanel = new JPanel(new GridLayout(2, 1, 10, 10));

        // Panel with FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        flowPanel.setBorder(BorderFactory.createTitledBorder("FlowLayout"));
        for (int i = 1; i <= 6; i++) {
            flowPanel.add(new JButton("Button " + i));
        }

        // Panel with GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        gridPanel.setBorder(BorderFactory.createTitledBorder("GridLayout"));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Button " + i));
        }

        // Add both panels to main panel
        mainPanel.add(flowPanel);
        mainPanel.add(gridPanel);

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
