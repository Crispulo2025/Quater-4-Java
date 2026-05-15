import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NestedPanelGUI extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JLabel statusLabel;
    private JButton clearButton, submitButton;

    public NestedPanelGUI() {

        // Frame setup
        setTitle("Nested Panels GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ===== TOP PANEL =====
        JPanel topPanel = new JPanel();
        statusLabel = new JLabel("Enter your text below:");
        topPanel.add(statusLabel);

        // ===== CENTER PANEL =====
        JPanel centerPanel = new JPanel();
        textArea = new JTextArea(8, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane);

        // ===== BOTTOM PANEL =====
        JPanel bottomPanel = new JPanel();

        clearButton = new JButton("Clear");
        submitButton = new JButton("Submit");

        clearButton.addActionListener(this);
        submitButton.addActionListener(this);

        bottomPanel.add(clearButton);
        bottomPanel.add(submitButton);

        // Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearButton) {
            textArea.setText("");
            statusLabel.setText("Text cleared.");
        }

        if (e.getSource() == submitButton) {
            String content = textArea.getText();

            if (content.trim().isEmpty()) {
                statusLabel.setText("Nothing to submit!");
            } else {
                statusLabel.setText("Submitted: " + content.length() + " characters");
            }
        }
    }

    public static void main(String[] args) {
        new NestedPanelGUI();
    }
}