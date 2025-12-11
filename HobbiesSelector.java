import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HobbiesSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Select Your Hobbies");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JCheckBoxes for hobbies
        JCheckBox hobby1 = new JCheckBox("Reading");
        JCheckBox hobby2 = new JCheckBox("Swimming");
        JCheckBox hobby3 = new JCheckBox("Gaming");
        JCheckBox hobby4 = new JCheckBox("Traveling");
        JCheckBox hobby5 = new JCheckBox("Cooking");

        // JTextArea to display selected hobbies
        JTextArea selectedHobbies = new JTextArea(8, 25);
        selectedHobbies.setEditable(false);

        // JButton to show selected hobbies
        JButton showButton = new JButton("Show Selected Hobbies");

        // ActionListener for button
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder hobbies = new StringBuilder();
                if (hobby1.isSelected()) hobbies.append(hobby1.getText()).append("\n");
                if (hobby2.isSelected()) hobbies.append(hobby2.getText()).append("\n");
                if (hobby3.isSelected()) hobbies.append(hobby3.getText()).append("\n");
                if (hobby4.isSelected()) hobbies.append(hobby4.getText()).append("\n");
                if (hobby5.isSelected()) hobbies.append(hobby5.getText()).append("\n");

                selectedHobbies.setText(hobbies.toString());
            }
        });

        // Add components to frame
        frame.add(hobby1);
        frame.add(hobby2);
        frame.add(hobby3);
        frame.add(hobby4);
        frame.add(hobby5);
        frame.add(showButton);
        frame.add(new JScrollPane(selectedHobbies));

        frame.setVisible(true);
    }
}
