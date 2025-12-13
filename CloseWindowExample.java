import javax.swing.JFrame;

public class CloseWindowExample {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("Close Window Example");

        // Set the size of the window
        frame.setSize(300, 200);

        // Ensure the application exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window
        frame.setVisible(true);
    }
}
