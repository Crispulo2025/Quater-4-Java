import javax.swing.*;
import java.awt.*;

public class TabbedPaneExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Notes and Reminders");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // --- Tab 1: Notes (JTextArea) ---
        JTextArea notesArea = new JTextArea();
        JScrollPane scrollNotes = new JScrollPane(notesArea);
        tabbedPane.add("Notes", scrollNotes);

        // --- Tab 2: Reminders (JList) ---
        String[] reminders = {
            "Pay bills",
            "Finish project",
            "Buy groceries",
            "Call family"
        };

        JList<String> reminderList = new JList<>(reminders);
        JScrollPane scrollList = new JScrollPane(reminderList);
        tabbedPane.add("Reminders", scrollList);

        // Add tabbed pane to the frame
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
