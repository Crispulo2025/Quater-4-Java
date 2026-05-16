import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class TextAreaClearExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Text Area with Clear Button");

        // Set layout
        frame.setLayout(new FlowLayout());

        // Create JTextArea
        JTextArea textArea = new JTextArea(10, 25);

        // Make it scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create button
        JButton clearButton = new JButton("Clear Text");

        // Button action: clear text area
        clearButton.addActionListener(e -> {
            textArea.setText("");
        });

        // Add components
        frame.add(scrollPane);
        frame.add(clearButton);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}