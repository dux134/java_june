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

        JPanel p = new JPanel();
        frame.add(p);

        Dimension d = new Dimension(500, 400);
        p.setPreferredSize(d);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Graphics g1 = p.getGraphics();

        g1.setColor(Color.cyan);
        g1.fillRect(0, 0, 500, 400);

        g1.setColor(Color.yellow);

        //top left pacman
        g1.fillArc(0, 0, 100, 100, 0, 270);

        //top right
        g1.fillArc(400, 0, 100, 100, -90, 270);

        //bottom left
        g1.fillArc(0, 300, 100, 100, 90, 270);

        //bottom right
        g1.fillArc(400, 300, 100, 100, 180, 270);


        g1.dispose();
    }
}
