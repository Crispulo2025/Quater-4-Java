import javax.swing.*;
import java.awt.*;

public class QuizGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        // ----- NORTH Panel: Question -----
        JPanel topPanel = new JPanel();
        JLabel questionLabel = new JLabel("What is the capital of France?");
        topPanel.add(questionLabel);

        // ----- CENTER Panel: 4 JRadioButtons arranged vertically -----
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        ButtonGroup optionsGroup = new ButtonGroup();

        JRadioButton option1 = new JRadioButton("Paris");
        JRadioButton option2 = new JRadioButton("London");
        JRadioButton option3 = new JRadioButton("Berlin");
        JRadioButton option4 = new JRadioButton("Madrid");

        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        centerPanel.add(option1);
        centerPanel.add(option2);
        centerPanel.add(option3);
        centerPanel.add(option4);

        // ----- SOUTH Panel: Next and Submit buttons -----
        JPanel bottomPanel = new JPanel(new FlowLayout());
        JButton nextButton = new JButton("Next");
        JButton submitButton = new JButton("Submit");
        bottomPanel.add(nextButton);
        bottomPanel.add(submitButton);

        // ----- Add panels to frame -----
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
