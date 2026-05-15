import javax.swing.JFrame;

public class CloseFrameExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Close Window Example");

        // Set size
        frame.setSize(500, 400);

        // Close the program when user clicks the X button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}