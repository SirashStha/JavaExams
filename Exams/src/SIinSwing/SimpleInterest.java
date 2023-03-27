package SIinSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterest extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    public SimpleInterest() {
        b1 = new JButton("Calculate SI");
        l1 = new JLabel("Principal");
        l2 = new JLabel("Time");
        l3 = new JLabel("Rate");
        l4 = new JLabel("Simple Interest");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        l1.setBounds(20,10,100,20);
        t1.setBounds(120,10,100,20);

        l2.setBounds(20,40,100,20);
        t2.setBounds(120,40,100,20);

        l3.setBounds(20,70,100,20);
        t3.setBounds(120,70,100,20);

        b1.setBounds(20,100,100,20);

        l4.setBounds(20,130,200,20);
        t4.setBounds(120,130,200,20);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);
        add(l4);
        b1.addActionListener(this);

        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            double p = Double.parseDouble(t1.getText());
            double t = Double.parseDouble(t2.getText());
            double r = Double.parseDouble(t3.getText());

            double si = (p * t * r)/100;

            l4.setText("Simple Interest is "+String.valueOf(si)+" per annum");
        }
    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
