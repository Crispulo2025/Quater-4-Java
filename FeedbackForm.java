import javax.swing.*;
import java.awt.*;

public class FeedbackForm extends JFrame {

    public FeedbackForm() {
        // Frame properties
        setTitle("Feedback Form");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Instruction JLabel spanning full width
        JLabel instructionLabel = new JLabel("Please provide your feedback below:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // span entire row
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(instructionLabel, gbc);

        // JTextArea below instructions, fills most space
        JTextArea feedbackArea = new JTextArea(10, 40);
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(feedbackArea);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH; // expand both horizontally and vertically
        panel.add(scrollPane, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FeedbackForm().setVisible(true);
        });
    }
}
