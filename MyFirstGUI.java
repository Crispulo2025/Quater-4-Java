import javax.swing.JFrame;

public class MyFirstGUI {

    public static void main(String[] args) {

        // Create JFrame with title
        JFrame frame = new JFrame("My First GUI");

        // Set size
        frame.setSize(500, 400);

        // Close application when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}