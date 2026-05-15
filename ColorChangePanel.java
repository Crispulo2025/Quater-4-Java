import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorChangePanel extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;
    private Random random;

    public ColorChangePanel() {

        // Frame setup
        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        random = new Random();

        // Panel whose background will change
        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        // Button
        button = new JButton("Change Color");
        button.addActionListener(this);

        // Add components
        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Generate random RGB color
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        Color newColor = new Color(r, g, b);

        // Change panel background
        panel.setBackground(newColor);
    }

    public static void main(String[] args) {
        new ColorChangePanel();
    }
}