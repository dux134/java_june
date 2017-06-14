package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 13/06/17.
 */
public class Demo implements ActionListener {

    public JButton b1;
    public JLabel l1;

    public static void main(String[] args) {

        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.b1) {
            System.out.println("change color button clicked");
            if(this.l1.getForeground() == Color.green) {
                this.l1.setForeground(Color.black);
            } else {
                this.l1.setForeground(Color.green);
            }
        } else {
            Demo.createWindow();
        }
    }

    private static void createWindow() {
        JFrame f1 = new JFrame();

        f1.setSize(400, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        f1.add(p1);

        Demo d1 = new Demo();

        d1.l1 = new JLabel();
        d1.l1.setText("Hello world!");
        p1.add(d1.l1);

        d1.b1 = new JButton();
        d1.b1.setText("Change color");
        p1.add(d1.b1);
        d1.b1.addActionListener(d1);

        JButton b2 = new JButton();
        b2.setText("new window");
        p1.add(b2);
        b2.addActionListener(d1);

        f1.setVisible(true);
    }
}
