import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Separate class implementing ActionListener
class ButtonClickHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
    }
}

public class SeparateActionListenerExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Separate ActionListener Example");

        // Create button
        JButton button = new JButton("Click Me");

        // Attach external ActionListener class
        button.addActionListener(new ButtonClickHandler());

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}