import javax.swing.*;
import java.awt.*;

public class SettingsPanelGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Settings Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- Settings Panel using GridBagLayout -----
        JPanel settingsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // ----- Checkboxes -----
        gbc.gridx = 0;
        gbc.gridy = 0;
        JCheckBox cb1 = new JCheckBox("Enable Notifications");
        settingsPanel.add(cb1, gbc);

        gbc.gridy = 1;
        JCheckBox cb2 = new JCheckBox("Enable Dark Mode");
        settingsPanel.add(cb2, gbc);

        // ----- Radio Buttons -----
        gbc.gridy = 2;
        settingsPanel.add(new JLabel("Select Theme:"), gbc);

        JRadioButton rb1 = new JRadioButton("Light");
        JRadioButton rb2 = new JRadioButton("Dark");
        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(rb1);
        themeGroup.add(rb2);

        gbc.gridy = 3;
        settingsPanel.add(rb1, gbc);
        gbc.gridy = 4;
        settingsPanel.add(rb2, gbc);

        // ----- Add settings panel to frame -----
        frame.add(settingsPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
