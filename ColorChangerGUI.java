import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel whose background will change
        JPanel colorPanel = new JPanel();

        // ComboBox with color options
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Gray"};
        JComboBox<String> colorBox = new JComboBox<>(colors);

        // Listener that changes panel background based on selection
        colorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorBox.getSelectedItem();

                switch (selectedColor) {
                    case "Red": colorPanel.setBackground(Color.RED); break;
                    case "Green": colorPanel.setBackground(Color.GREEN); break;
                    case "Blue": colorPanel.setBackground(Color.BLUE); break;
                    case "Yellow": colorPanel.setBackground(Color.YELLOW); break;
                    case "Gray": colorPanel.setBackground(Color.GRAY); break;
                }
            }
        });

        // Add components
        frame.add(colorBox, BorderLayout.NORTH);
        frame.add(colorPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
