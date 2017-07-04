package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 03/07/17.
 */
public class LoginScreen {

    public String title;
    private JButton loginButton;
    private JTextField usernameField;
    private JTextField passwordField;
    public JPanel myPanel;

    public LoginScreen() {
        super();

        this.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LoginScreen.this.usernameField.getText());
                System.out.println(LoginScreen.this.passwordField.getText());
            }
        });
    }





    public void talk() {

    }

    public static void walk() {

    }

    public static class Xyz {

        public String title;


        public void printDetail() {
            System.out.println("Title is " + this.title);
        }
    }

    public class Pqr {

        public String title;


        public void printDetail() {
            System.out.println("Title is " + this.title + " parent title is " + LoginScreen.this.title);
        }

    }
}
