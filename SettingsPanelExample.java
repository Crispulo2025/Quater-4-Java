import javax.swing.*;
import java.awt.*;

public class SettingsPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Settings Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new BorderLayout());

        // --- Settings Panel (GridBagLayout) ---
        JPanel settingsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;  // align left
        
        // Components
        JCheckBox chkOption1 = new JCheckBox("Enable Notifications");
        JCheckBox chkOption2 = new JCheckBox("Dark Mode");

        JRadioButton rbChoice1 = new JRadioButton("Basic Mode");
        JRadioButton rbChoice2 = new JRadioButton("Advanced Mode");

        ButtonGroup group = new ButtonGroup();
        group.add(rbChoice1);
        group.add(rbChoice2);

        // Add components vertically
        gbc.gridx = 0;
        gbc.gridy = 0;
        settingsPanel.add(chkOption1, gbc);

        gbc.gridy = 1;
        settingsPanel.add(chkOption2, gbc);

        gbc.gridy = 2;
        settingsPanel.add(rbChoice1, gbc);

        gbc.gridy = 3;
        settingsPanel.add(rbChoice2, gbc);

        // Add panel to main frame (CENTER region)
        frame.add(settingsPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
