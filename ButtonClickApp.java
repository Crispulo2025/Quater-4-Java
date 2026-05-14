import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickApp {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Button Click App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPanel
        JPanel panel = new JPanel();

        // Create JButton
        JButton button = new JButton("Click Me");

        // Add action listener to handle click event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        // Add button to panel
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        // Display window
        frame.setVisible(true);
    }
}