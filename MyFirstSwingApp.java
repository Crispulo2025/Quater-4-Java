import javax.swing.JFrame;

public class MyFirstSwingApp {
    public static void main(String[] args) {

        // Create a JFrame
        JFrame frame = new JFrame("My First Swing App");

        // Set size (width, height)
        frame.setSize(400, 300);

        // Exit application when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}