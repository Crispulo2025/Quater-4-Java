import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeaturesAndPlanSelector {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Plan and Features Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // --- Radio Buttons (Single Selection: Plan) ---
        JLabel planLabel = new JLabel("Select a Plan:");
        JRadioButton basicPlan = new JRadioButton("Basic");
        JRadioButton premiumPlan = new JRadioButton("Premium");
        JRadioButton proPlan = new JRadioButton("Pro");

        ButtonGroup planGroup = new ButtonGroup();
        planGroup.add(basicPlan);
        planGroup.add(premiumPlan);
        planGroup.add(proPlan);

        // Default selection
        basicPlan.setSelected(true);

        // --- Checkboxes (Multiple Selection: Features) ---
        JLabel featureLabel = new JLabel("Select Optional Features:");
        JCheckBox feature1 = new JCheckBox("Cloud Backup");
        JCheckBox feature2 = new JCheckBox("24/7 Support");
        JCheckBox feature3 = new JCheckBox("Extra Storage");

        // --- Button to display results ---
        JButton showButton = new JButton("Show Selections");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get selected plan
                String plan = "";
                if (basicPlan.isSelected()) plan = "Basic";
                else if (premiumPlan.isSelected()) plan = "Premium";
                else if (proPlan.isSelected()) plan = "Pro";

                // Get selected features
                StringBuilder features = new StringBuilder();
                if (feature1.isSelected()) features.append("Cloud Backup, ");
                if (feature2.isSelected()) features.append("24/7 Support, ");
                if (feature3.isSelected()) features.append("Extra Storage, ");

                String featuresText = features.length() > 0
                        ? features.substring(0, features.length() - 2)  // remove last comma
                        : "No optional features selected";

                // Show message dialog
                JOptionPane.showMessageDialog(
                        frame,
                        "Selected Plan: " + plan + "\nFeatures: " + featuresText
                );
            }
        });

        // --- Add components to frame ---
        frame.add(planLabel);
        frame.add(basicPlan);
        frame.add(premiumPlan);
        frame.add(proPlan);

        frame.add(featureLabel);
        frame.add(feature1);
        frame.add(feature2);
        frame.add(feature3);

        frame.add(showButton);

        frame.setVisible(true);
    }
}
