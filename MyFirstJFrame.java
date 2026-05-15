import javax.swing.JFrame;

public class MyFirstJFrame {
    public static void main(String[] args) {

        // Create the JFrame
        JFrame frame = new JFrame("My First JFrame");

        // Set the size of the window
        frame.setSize(500, 400);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}