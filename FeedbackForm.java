import javax.swing.*;
import java.awt.*;

public class FeedbackForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Feedback Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLayout(new BorderLayout());

        // Instruction label (spans full width)
        JLabel instruction = new JLabel("Please provide your feedback below:", SwingConstants.CENTER);
        instruction.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(instruction, BorderLayout.NORTH);

        // Text area that fills most of the window
        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);

        // Scroll pane in case text gets long
        JScrollPane scrollPane = new JScrollPane(feedbackArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
