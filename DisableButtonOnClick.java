import javax.swing.JButton;
import javax.swing.JFrame;

public class DisableButtonOnClick {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Disable Button Example");

        // Create button
        JButton button = new JButton("Click Me Once");

        // Disable button after first click
        button.addActionListener(e -> {
            button.setEnabled(false);
        });

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}