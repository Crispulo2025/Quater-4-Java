import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class VerticalTextFields {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("GridLayout Example");

        // Set GridLayout (3 rows, 1 column)
        frame.setLayout(new GridLayout(3, 1));

        // Create text fields
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();

        // Add text fields to frame
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}