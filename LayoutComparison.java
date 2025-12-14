import javax.swing.*;
import java.awt.*;

public class LayoutComparison {
    public static void main(String[] args) {
        // Frame with no layout manager
        JFrame frameNoLayout = new JFrame("No Layout Manager");
        frameNoLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameNoLayout.setSize(300, 150);
        frameNoLayout.setLayout(null); // no layout manager

        // Buttons manually positioned
        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(10, 20, 80, 30); // x, y, width, height
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(100, 20, 80, 30);
        JButton btn3 = new JButton("Button 3");
        btn3.setBounds(190, 20, 80, 30);

        frameNoLayout.add(btn1);
        frameNoLayout.add(btn2);
        frameNoLayout.add(btn3);
        frameNoLayout.setVisible(true);

        // Frame with FlowLayout
        JFrame frameFlowLayout = new JFrame("FlowLayout Example");
        frameFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFlowLayout.setSize(300, 150);
        frameFlowLayout.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); // FlowLayout with gaps

        // Buttons automatically arranged
        frameFlowLayout.add(new JButton("Button 1"));
        frameFlowLayout.add(new JButton("Button 2"));
        frameFlowLayout.add(new JButton("Button 3"));
        frameFlowLayout.setVisible(true);
    }
}
