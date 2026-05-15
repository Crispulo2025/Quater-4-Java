import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class ChangeTitleAfterDelay {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Original Title");

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Timer to change title after 5 seconds (5000 ms)
        Timer timer = new Timer(5000, e -> {
            frame.setTitle("Title Changed After 5 Seconds");
        });

        timer.setRepeats(false); // run only once
        timer.start();
    }
}