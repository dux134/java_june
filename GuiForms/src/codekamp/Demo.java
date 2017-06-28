package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 28/06/17.
 */
public class Demo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LoginScreen s = new LoginScreen();

        //add UI elements inside p

        frame.add(s.myPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
