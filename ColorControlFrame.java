import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class ColorControlFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Color Control Window");

        // Set layout to null for simple positioning
        frame.setLayout(null);

        // Create buttons
        JButton changeColorBtn = new JButton("Change Color");
        JButton resetBtn = new JButton("Reset");
        JButton exitBtn = new JButton("Exit");

        // Set button positions
        changeColorBtn.setBounds(50, 50, 150, 30);
        resetBtn.setBounds(50, 100, 150, 30);
        exitBtn.setBounds(50, 150, 150, 30);

        // Change background color
        changeColorBtn.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.CYAN);
        });

        // Reset background color
        resetBtn.addActionListener(e -> {
            frame.getContentPane().setBackground(null);
        });

        // Exit application
        exitBtn.addActionListener(e -> {
            System.exit(0);
        });

        // Add buttons
        frame.add(changeColorBtn);
        frame.add(resetBtn);
        frame.add(exitBtn);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}