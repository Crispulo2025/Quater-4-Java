import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        // --- Profile Tab ---
        JPanel profilePanel = new JPanel();
        profilePanel.add(new JLabel("Enter your name:"));
        JTextField nameField = new JTextField(15);
        profilePanel.add(nameField);
        JButton saveNameBtn = new JButton("Save");
        profilePanel.add(saveNameBtn);

        // --- Settings Tab ---
        JPanel settingsPanel = new JPanel();
        settingsPanel.add(new JLabel("Enable Notifications:"));
        JCheckBox notifCheck = new JCheckBox();
        settingsPanel.add(notifCheck);

        // --- Dashboard Tab ---
        JPanel dashboardPanel = new JPanel();
        JButton refreshBtn = new JButton("Refresh Dashboard");
        dashboardPanel.add(refreshBtn);

        // Add tabs
        tabbedPane.addTab("Profile", profilePanel);
        tabbedPane.addTab("Settings", settingsPanel);
        tabbedPane.addTab("Dashboard", dashboardPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
