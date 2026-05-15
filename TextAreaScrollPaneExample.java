import javax.swing.*;

public class TextAreaScrollPaneExample {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("JTextArea with JScrollPane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTextArea
        JTextArea textArea = new JTextArea();

        // Add sample text
        textArea.setText(
                "Welcome to Java Swing!\n\n" +
                "This is a sample JTextArea inside a JScrollPane.\n" +
                "You can type multiple lines of text here.\n\n" +
                "Sample Topics:\n" +
                "- Java GUI Programming\n" +
                "- Swing Components\n" +
                "- Event Handling\n" +
                "- Layout Managers\n\n" +
                "Scrolling is automatically enabled when the text becomes too long."
        );

        // Create JScrollPane and add JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add JScrollPane to JFrame
        frame.add(scrollPane);

        // Make frame visible
        frame.setVisible(true);
    }
}