import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Themed Tabs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create color panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        // Add tabs
        tabbedPane.addTab("Red", redPanel);
        tabbedPane.addTab("Green", greenPanel);
        tabbedPane.addTab("Blue", bluePanel);

        // Add ChangeListener to change frame background
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                switch (index) {
                    case 0: frame.getContentPane().setBackground(Color.RED); break;
                    case 1: frame.getContentPane().setBackground(Color.GREEN); break;
                    case 2: frame.getContentPane().setBackground(Color.BLUE); break;
                }
            }
        });

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
