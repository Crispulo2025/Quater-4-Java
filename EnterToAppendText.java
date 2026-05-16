import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class EnterToAppendText {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Enter Key to Append Text");

        // Create JTextField
        JTextField textField = new JTextField();

        // Create JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        // Add scroll pane to text area
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Action when Enter is pressed in JTextField
        textField.addActionListener(e -> {
            String text = textField.getText();
            textArea.append(text + "\n");
            textField.setText("");
        });

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}