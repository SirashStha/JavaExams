package GridLayout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {
        JButton b1 = new JButton("A");
        JButton b2 = new JButton("B");
        JButton b3 = new JButton("C");
        JButton b4 = new JButton("D");
        JButton b5 = new JButton("E");
        JButton b6 = new JButton("F");
        JButton b7 = new JButton("G");
        JButton b8 = new JButton("H");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);

        setSize(600,600);
        setVisible(true);
        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
