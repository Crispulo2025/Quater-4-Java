import javax.swing.*;

public class ScrollPaneTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollPane with JTextArea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Put the text area inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add scroll pane to frame
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
