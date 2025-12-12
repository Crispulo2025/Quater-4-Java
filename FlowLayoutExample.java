import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample extends JFrame {

    public FlowLayoutExample() {
        // Frame properties
        setTitle("FlowLayout Centered Example");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel with centered FlowLayout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // JTextField
        JTextField textField = new JTextField(15);

        // Buttons
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        // Add components to panel
        panel.add(textField);
        panel.add(okButton);
        panel.add(cancelButton);

        // Add action listeners (optional)
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Text entered: " + textField.getText());
            }
        });

        cancelButton.addActionListener(e -> textField.setText("")); // clears the text field

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FlowLayoutExample().setVisible(true);
        });
    }
}
