package codekamp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        JPanel p = new JPanel();

        Dimension d = new Dimension(500, 400);
        p.setPreferredSize(d);
        frame.add(p);

        frame.pack();
        frame.setVisible(true);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int x = 0;
        int y = 0;

        int xVel = 3;
        int yVel = 3;
        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x = x + xVel;
            y = y + yVel;

            if(x >= 400) {
                x = 400;
                xVel = -3;
            }

            if(y >= 300) {
                y = 300;
                yVel = -3;
            }

            if(x <= 0) {
                x = 0;
                xVel = 3;
            }

            if(y <= 0) {
                y = 0;
                yVel = 3;
            }

            Graphics g = p.getGraphics();

            g.clearRect(0, 0, 500, 400);

            g.setColor(Color.cyan);
            g.fillRect(0,0,500,400);

            g.setColor(Color.yellow);
            g.fillOval(x, y, 100, 100);

            g.dispose();
        }
    }
}
