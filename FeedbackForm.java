import javax.swing.*;
import java.awt.*;

public class FeedbackForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Feedback Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // ----- TOP PANEL: Instruction label spanning full width -----
        JPanel topPanel = new JPanel();
        JLabel instruction = new JLabel("Please write your feedback below:");
        topPanel.add(instruction);

        // ----- CENTER PANEL: Large text area -----
        JPanel centerPanel = new JPanel(new BorderLayout());
        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(feedbackArea);
        centerPanel.add(scroll, BorderLayout.CENTER);

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
