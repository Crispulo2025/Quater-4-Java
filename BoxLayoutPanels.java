import javax.swing.*;
import java.awt.*;

public class BoxLayoutPanels extends JFrame {

    public BoxLayoutPanels() {

        // Frame setup
        setTitle("BoxLayout Panels Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BoxLayout (vertical stacking)
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // ===== First Panel =====
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);

        panel1.add(new JLabel("Enter Name:"));
        panel1.add(new JTextField(15));

        // ===== Second Panel =====
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.WHITE);

        panel2.add(new JButton("Submit"));
        panel2.add(new JButton("Cancel"));

        // Add panels vertically
        add(panel1);
        add(panel2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutPanels();
    }
}