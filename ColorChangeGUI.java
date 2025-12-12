import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Change GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- NORTH Panel -----
        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.CYAN);
        JButton northButton = new JButton("Change Center Color");
        northPanel.add(northButton);

        // ----- CENTER Panel -----
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);

        // ----- SOUTH Panel -----
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.ORANGE);
        JButton southButton = new JButton("Change Center Color");
        southPanel.add(southButton);

        // ----- Add panels to frame -----
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);

        // ----- Action: Change CENTER panel color randomly -----
        ActionListener changeColor = e -> {
            Color randomColor = new Color(
                    (float)Math.random(),
                    (float)Math.random(),
                    (float)Math.random()
            );
            centerPanel.setBackground(randomColor);
        };

        northButton.addActionListener(changeColor);
        southButton.addActionListener(changeColor);

        frame.setVisible(true);
    }
}
