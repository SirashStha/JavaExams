package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    BorderLayoutDemo() {

        JButton b1 = new JButton("East");
        JButton b2 = new JButton("West");
        JButton b3 = new JButton("North");
        JButton b4 = new JButton("South");
        JButton b5 = new JButton("Center");

        add(b1, BorderLayout.EAST);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.NORTH);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);

        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
