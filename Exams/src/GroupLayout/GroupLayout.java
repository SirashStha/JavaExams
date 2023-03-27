//package GroupLayout;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class GroupLayout  {
//    public GroupLayout(Container contentPanel) {
//
//    }
//
//    public static void main(String[] args) {
//        JFrame f = new JFrame("Group Layout");
//        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
//
//        Container contentPanel = f.getContentPane();
//        GroupLayout gl = new GroupLayout(contentPanel);
//        contentPanel.setLayout((LayoutManager) gl);
//        JLabel l = new JLabel("Click");
//        JButton b = new JButton("Button");
//
//        gl.setHorizontalGroup(
//                gl.createSequentialGroup()
//                    .addComponent(l)
//                        .addGap(10,20,100)
//                        .addComponent(b)
//        )
//    }
//}
