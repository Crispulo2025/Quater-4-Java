import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeLayoutExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Change Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel with initial FlowLayout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Add buttons to the panel
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        // Create a toggle button to change layout
        JButton toggleButton = new JButton("Switch to GridLayout");

        toggleButton.addActionListener(new ActionListener() {
            boolean isFlow = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFlow) {
                    panel.setLayout(new GridLayout(1, 3, 5, 5)); // change to GridLayout
                    toggleButton.setText("Switch to FlowLayout");
                } else {
                    panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // back to FlowLayout
                    toggleButton.setText("Switch to GridLayout");
                }
                isFlow = !isFlow;

                panel.revalidate(); // re-layout the panel
                panel.repaint();    // repaint to update display
            }
        });

        // Add components to frame
        frame.setLayout(new BorderLayout(10, 10));
        frame.add(panel, BorderLayout.CENTER);
        frame.add(toggleButton, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}
