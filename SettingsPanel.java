import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JFrame {

    public SettingsPanel() {
        // Frame properties
        setTitle("Settings Panel");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between components
        gbc.anchor = GridBagConstraints.WEST; // align components to the left

        // Checkboxes
        JCheckBox check1 = new JCheckBox("Enable notifications");
        JCheckBox check2 = new JCheckBox("Dark mode");
        JCheckBox check3 = new JCheckBox("Auto-update");

        // Radio buttons (mutually exclusive)
        JRadioButton radio1 = new JRadioButton("Option A");
        JRadioButton radio2 = new JRadioButton("Option B");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radio1);
        radioGroup.add(radio2);

        // Add checkboxes to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(check1, gbc);

        gbc.gridy = 1;
        panel.add(check2, gbc);

        gbc.gridy = 2;
        panel.add(check3, gbc);

        // Add radio buttons to panel
        gbc.gridy = 3;
        panel.add(radio1, gbc);

        gbc.gridy = 4;
        panel.add(radio2, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SettingsPanel().setVisible(true);
        });
    }
}
