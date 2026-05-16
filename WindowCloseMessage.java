import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloseMessage {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Window Listener Example");

        // Add WindowListener using WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing. Goodbye!");
            }
        });

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}