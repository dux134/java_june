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
        s.title = "CodeKamp";

        LoginScreen s1 = new LoginScreen();
        s1.title = "Java";

        f.add(s.myPanel);
        f.pack();
        f.setVisible(true);



        LoginScreen.walk();
        s.talk();

        LoginScreen.Xyz b1 = new LoginScreen.Xyz();
        LoginScreen.Xyz b2 = new LoginScreen.Xyz();
        LoginScreen.Xyz b3 = new LoginScreen.Xyz();
        LoginScreen.Pqr a2 = s.new Pqr();
        LoginScreen.Pqr a3 = s1.new Pqr();
        LoginScreen.Pqr a4 = s.new Pqr();

        a2.title = "Amar";
        a3.title = "Akbar";
        a4.title = "Anthony";

        b1.title = "Amar";
        b2.title = "Akbar";
        b3.title = "Anthony";

        a2.printDetail();
        a3.printDetail();
        a4.printDetail();

        b1.printDetail();
        b2.printDetail();
        b3.printDetail();

        s1.talk();
        s.talk();
    }
}
