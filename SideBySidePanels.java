import javax.swing.*;
import java.awt.*;

public class SideBySidePanels {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Two Side-by-Side Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // ----- Main panel (uses standard FlowLayout or BorderLayout for side-by-side placement) -----
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2, 10, 0)); // side-by-side columns

        // ----- Left panel with vertical BoxLayout -----
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createTitledBorder("Options"));

        leftPanel.add(new JCheckBox("Option 1"));
        leftPanel.add(new JCheckBox("Option 2"));
        leftPanel.add(new JCheckBox("Option 3"));
        leftPanel.add(new JCheckBox("Option 4"));

        // ----- Right panel with FlowLayout -----
        JPanel rightPanel = new JPanel(new FlowLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Actions"));

        rightPanel.add(new JButton("OK"));
        rightPanel.add(new JButton("Cancel"));

        // Add panels to main panel
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
