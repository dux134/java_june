package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 03/07/17.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LoginScreen s = new LoginScreen();

        f.add(s.myPanel);
        f.pack();
        f.setVisible(true);
    }
}
