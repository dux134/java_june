package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 14/06/17.
 */
public class Demo implements ActionListener {

    public static JButton b1;
    public static JLabel l1;


    public static JButton b2;
    public static JLabel l2;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JFrame f2 = new JFrame();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        f1.setSize(400, 300);
        f2.setSize(400, 300);

        f2.setLocation(400, 0);

        f1.add(p1);
        f2.add(p2);

        Demo.b1 = new JButton();
        Demo.b1.setText("Change Color");

        Demo.b2 = new JButton();
        Demo.b2.setText("Change Color");

        Demo d = new Demo();

        Demo.b1.addActionListener(d);
        Demo.b2.addActionListener(d);

        Demo.l1 = new JLabel();
        Demo.l2 = new JLabel();

        Demo.l1.setText("welcome to CodeKamp");
        Demo.l2.setText("welcome to CodeKamp");

        p1.add(Demo.l1);
        p1.add(Demo.b1);

        p2.add(Demo.l2);
        p2.add(Demo.b2);

        f1.setVisible(true);
        f2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Demo.b1) {
            Demo.l2.setForeground(Color.green);
        } else {
            Demo.l1.setForeground(Color.green);
        }
    }
}
