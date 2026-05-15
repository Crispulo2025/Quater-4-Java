import javax.swing.JFrame;

public class NonResizableFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Non-Resizable JFrame");

        // Set frame size
        frame.setSize(500, 400);

        // Make frame non-resizable
        frame.setResizable(false);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make visible
        frame.setVisible(true);
    }
}