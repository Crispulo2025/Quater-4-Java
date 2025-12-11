import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Gray"};

        JComboBox<String> colorBox = new JComboBox<>(colors);

        // Add listener to change background color
        colorBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) colorBox.getSelectedItem();

                switch (selected) {
                    case "Red": panel.setBackground(Color.RED); break;
                    case "Green": panel.setBackground(Color.GREEN); break;
                    case "Blue": panel.setBackground(Color.BLUE); break;
                    case "Yellow": panel.setBackground(Color.YELLOW); break;
                    case "Gray": panel.setBackground(Color.GRAY); break;
                }
            }
        });

        panel.add(colorBox);
        frame.add(panel);
        frame.setVisible(true);
    }
}
