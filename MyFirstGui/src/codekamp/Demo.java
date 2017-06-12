package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 12/06/17.
 */
public class Demo implements ActionListener {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();
        f1.setSize(400, 300);
        f1.setLocation(100, 400);
        f1.setTitle("CodeKamp window");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField();
        t1.setText("enter username");

        JTextField t2 = new JTextField();
        t2.setText("enter password");

        JButton b1 = new JButton();
        b1.setText("Login");

        Demo d1 = new Demo();
        b1.addActionListener(d1);

        //whenever b1 button will be clicked, it will call d1.actionPerformed(ActionEvent e)

        JLabel l1 = new JLabel();
        l1.setText("some fixed text");
        l1.setForeground(Color.green);

        JPanel panel = new JPanel();
        f1.add(panel);


        panel.add(t1);
        panel.add(t2);
        panel.add(b1);
        panel.add(l1);

        f1.setVisible(true);

        System.out.println("main function complete");

        //
    }

    public static void login(String username, String password) {
        System.out.println("login button clicked");
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("login button clicked");
    }
}
