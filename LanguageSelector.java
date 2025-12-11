import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LanguageSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programming Language Selector");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Checkboxes
        JCheckBox cbJava = new JCheckBox("Java");
        JCheckBox cbPython = new JCheckBox("Python");
        JCheckBox cbCSharp = new JCheckBox("C#");

        // Button
        JButton btnCount = new JButton("Count Selected");

        // Action Listener
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = 0;

                if (cbJava.isSelected()) count++;
                if (cbPython.isSelected()) count++;
                if (cbCSharp.isSelected()) count++;

                JOptionPane.showMessageDialog(frame, 
                    "Total languages selected: " + count);
            }
        });

        // Add components to frame
        frame.add(cbJava);
        frame.add(cbPython);
        frame.add(cbCSharp);
        frame.add(btnCount);

        // Show frame
        frame.setVisible(true);
    }
}
