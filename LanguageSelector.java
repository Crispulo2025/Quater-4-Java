import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LanguageSelector extends JFrame implements ActionListener {

    private JRadioButton javaBtn, pythonBtn, cppBtn;
    private ButtonGroup group;
    private JButton showButton;
    private JLabel resultLabel;

    public LanguageSelector() {

        // Frame setup
        setTitle("Programming Language Selector");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Radio buttons
        javaBtn = new JRadioButton("Java");
        pythonBtn = new JRadioButton("Python");
        cppBtn = new JRadioButton("C++");

        // Group them so only one can be selected
        group = new ButtonGroup();
        group.add(javaBtn);
        group.add(pythonBtn);
        group.add(cppBtn);

        // Default selection
        javaBtn.setSelected(true);

        // Button
        showButton = new JButton("Show Selection");
        showButton.addActionListener(this);

        // Result label
        resultLabel = new JLabel("Selected: Java");

        // Add components
        add(new JLabel("Choose your preferred language:"));
        add(javaBtn);
        add(pythonBtn);
        add(cppBtn);
        add(showButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String selection;

        if (javaBtn.isSelected()) {
            selection = "Java";
        } else if (pythonBtn.isSelected()) {
            selection = "Python";
        } else {
            selection = "C++";
        }

        resultLabel.setText("Selected: " + selection);
    }

    public static void main(String[] args) {
        new LanguageSelector();
    }
}