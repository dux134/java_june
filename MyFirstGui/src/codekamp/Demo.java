package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 12/06/17.
 */
public class Demo implements ActionListener {

    public static JTextField t1 = new JTextField();
    public static JTextField t2 = new JTextField();

    public static void main(String[] args) {

        JFrame f1 = new JFrame();
        f1.setSize(400, 300);
        f1.setLocation(100, 400);
        f1.setTitle("CodeKamp window");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Demo.t1 = new JTextField();
        Demo.t1.setText("enter username");

        Demo.t2 = new JTextField();
        Demo.t2.setText("enter password");

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


        panel.add(Demo.t1);
        panel.add(Demo.t2);
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

        String username = Demo.t1.getText();
        String password = Demo.t2.getText();

        System.out.println(username);
        System.out.println(password);
    }
}
