import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewsletterCheckbox {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Newsletter Subscription");

        // Create JCheckBox
        JCheckBox checkBox = new JCheckBox("Subscribe to Newsletter");

        // Add action listener
        checkBox.addActionListener(e -> {
            if (checkBox.isSelected()) {
                JOptionPane.showMessageDialog(frame, "You subscribed!");
            } else {
                JOptionPane.showMessageDialog(frame, "You unsubscribed!");
            }
        });

        // Add checkbox to frame
        frame.add(checkBox);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}