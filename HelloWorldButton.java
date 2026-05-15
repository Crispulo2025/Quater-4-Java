import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldButton {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Hello Button App");

        // Create button
        JButton button = new JButton("Click Me");

        // Add action listener to print message
        button.addActionListener(e -> System.out.println("Hello, World!"));

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}