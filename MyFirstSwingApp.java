import javax.swing.JFrame;

public class MyFirstSwingApp {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("My First Swing App");

        // Set the size of the window
        frame.setSize(400, 300);

        // Exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}
