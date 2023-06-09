package FlowLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    FlowLayoutDemo() {
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setSize(600,600);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
