import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the TabbedPane
        JTabbedPane tabs = new JTabbedPane();

        // -------------------- HOME PANEL --------------------
        JPanel homePanel = new JPanel();
        homePanel.setLayout(new FlowLayout());
        homePanel.add(new JLabel("Welcome to Home!"));
        homePanel.add(new JButton("Click Me"));

        // -------------------- PROFILE PANEL --------------------
        JPanel profilePanel = new JPanel();
        profilePanel.setLayout(new FlowLayout());
        profilePanel.add(new JLabel("Name:"));
        profilePanel.add(new JTextField(12));

        // -------------------- SETTINGS PANEL --------------------
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new FlowLayout());
        settingsPanel.add(new JLabel("Enable notifications:"));
        settingsPanel.add(new JCheckBox());

        // Add panels to tabs
        tabs.add("Home", homePanel);
        tabs.add("Profile", profilePanel);
        tabs.add("Settings", settingsPanel);

        // Add to frame
        frame.add(tabs);
        frame.setVisible(true);
    }
}
