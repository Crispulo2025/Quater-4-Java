import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Text Area Example");

        // Create JTextArea (rows, columns)
        JTextArea textArea = new JTextArea(10, 30);

        // Make it scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add scroll pane (not directly textArea)
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}