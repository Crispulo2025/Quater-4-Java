import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class FourFieldsBoxLayout {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("BoxLayout - Four Text Fields");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with horizontal BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setBorder(new EmptyBorder(12, 12, 12, 12)); // outer padding

        // Create four text fields with preferred sizes
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField f3 = new JTextField();
        JTextField f4 = new JTextField();

        Dimension fieldSize = new Dimension(120, 28);
        f1.setMaximumSize(fieldSize);
        f2.setMaximumSize(fieldSize);
        f3.setMaximumSize(fieldSize);
        f4.setMaximumSize(fieldSize);

        // Add components and rigid areas (spacing) between them
        panel.add(f1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(f2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(f3);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(f4);

        // Optional: glue to push components to left or center
        // panel.add(Box.createHorizontalGlue());

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // center on screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FourFieldsBoxLayout::createAndShowGUI);
    }
}
