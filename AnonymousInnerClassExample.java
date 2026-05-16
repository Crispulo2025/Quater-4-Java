import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousInnerClassExample {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Anonymous Inner Class Example");

        // Create button
        JButton button = new JButton("Click Me");

        // Anonymous inner class for handling button click
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Button clicked using Anonymous Inner Class!");
            }
        });

        // Add button to frame
        frame.add(button);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}