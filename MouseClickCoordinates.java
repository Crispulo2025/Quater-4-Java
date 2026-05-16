import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickCoordinates {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Mouse Click Coordinates");

        // Create label
        JLabel label = new JLabel("Click inside the panel");

        // Create panel
        JPanel panel = new JPanel();
        panel.add(label);

        // Mouse listener for detecting clicks
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                label.setText("Clicked at: (" + x + ", " + y + ")");
            }
        });

        // Add panel to frame
        frame.add(panel);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}