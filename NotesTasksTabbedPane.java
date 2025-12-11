import javax.swing.*;
import java.awt.*;

public class NotesTasksTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Notes and Tasks");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // -------------------- Tab 1: Notes --------------------
        JPanel notesPanel = new JPanel();
        notesPanel.setLayout(new BorderLayout());
        JTextArea notesArea = new JTextArea("Write your notes here...");
        notesPanel.add(new JScrollPane(notesArea), BorderLayout.CENTER);

        // -------------------- Tab 2: Tasks --------------------
        JPanel tasksPanel = new JPanel();
        tasksPanel.setLayout(new BorderLayout());
        String[] tasks = {"Finish report", "Attend meeting", "Reply emails", "Prepare presentation"};
        JList<String> taskList = new JList<>(tasks);
        tasksPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Add tabs to JTabbedPane
        tabbedPane.addTab("Notes", notesPanel);
        tabbedPane.addTab("Tasks", tasksPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
