import javax.swing.*;
import java.awt.*;

public class QuizInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Top panel with question
        JPanel topPanel = new JPanel();
        JLabel questionLabel = new JLabel("What is the capital of France?");
        topPanel.add(questionLabel);

        // Center panel with radio buttons
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JRadioButton option1 = new JRadioButton("Berlin");
        JRadioButton option2 = new JRadioButton("Madrid");
        JRadioButton option3 = new JRadioButton("Paris");
        JRadioButton option4 = new JRadioButton("Rome");

        // Group buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        centerPanel.add(option1);
        centerPanel.add(option2);
        centerPanel.add(option3);
        centerPanel.add(option4);

        // Bottom panel with buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        JButton nextButton = new JButton("Next");
        JButton submitButton = new JButton("Submit");

        bottomPanel.add(nextButton);
        bottomPanel.add(submitButton);

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
