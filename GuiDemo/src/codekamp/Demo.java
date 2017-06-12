package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 09/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel p1 = new JPanel();
        frame.add(p1);

        JTextField usernameField = new JTextField();
        usernameField.setText("enter username");

        JTextField passwordField = new JTextField();
        passwordField.setText("enter password");

        JButton button = new JButton();
        button.setText("Login");

        p1.add(usernameField);
        p1.add(passwordField);
        p1.add(button);

        frame.setVisible(true);
    }
}
