import javax.swing.*;

public class VotingEligibility {
    public static void main(String[] args) {

        // Ask user for age using input dialog
        String input = JOptionPane.showInputDialog(null, "Enter your age:", "Voting Eligibility", JOptionPane.QUESTION_MESSAGE);

        // Convert input to integer
        int age = 0;
        try {
            age = Integer.parseInt(input);

            // Check voting eligibility
            if (age >= 18) {
                JOptionPane.showMessageDialog(null, "You are eligible to vote!", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else if (age >= 0) {
                JOptionPane.showMessageDialog(null, "You are not eligible to vote yet.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid age entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
