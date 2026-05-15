import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageInJFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Image Display");

        // Load image (make sure the image file is in the project folder)
        ImageIcon imageIcon = new ImageIcon("image.jpg");

        // Create JLabel with image
        JLabel label = new JLabel(imageIcon);

        // Add label to frame
        frame.add(label);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}