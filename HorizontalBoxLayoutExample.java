import javax.swing.*;
import java.awt.*;

public class HorizontalBoxLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Horizontal BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 100);

        // ----- Main panel with horizontal BoxLayout -----
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Create four text fields
        JTextField tf1 = new JTextField(5);
        JTextField tf2 = new JTextField(5);
        JTextField tf3 = new JTextField(5);
        JTextField tf4 = new JTextField(5);

        // Add text fields with rigid areas for spacing
        panel.add(tf1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(tf2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(tf3);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.add(tf4);

        frame.add(panel);
        frame.setVisible(true);
    }
}
