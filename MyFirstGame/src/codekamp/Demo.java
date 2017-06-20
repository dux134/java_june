package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {

    private static int xVel = 3;
    private static int yVel = 3;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        JPanel p = new JPanel();

        Dimension d = new Dimension(500, 400);
        p.setPreferredSize(d);
        p.setFocusable(true);

        Demo demo1 = new Demo();
        p.addKeyListener(demo1);
        frame.add(p);

        frame.pack();
        frame.setVisible(true);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        p.requestFocus();

        int x = 0;
        int y = 0;

        Color ballColor = Color.yellow;
        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x = x + Demo.xVel;
            y = y + Demo.yVel;

            Graphics g = p.getGraphics();

            g.clearRect(0, 0, 500, 400);

            g.setColor(Color.cyan);
            g.fillRect(0,0,500,400);

            g.setColor(ballColor);
            g.fillOval(x, y, 100, 100);

            g.dispose();
        }
    }

    private static int modulus(int a) {
        return a > 0 ? a : a*-1;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.xVel = 0;
            Demo.yVel = 3;
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            Demo.xVel = 0;
            Demo.yVel = -3;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Demo.xVel = 3;
            Demo.yVel = 0;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            Demo.xVel = -3;
            Demo.yVel = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //do nothing
    }
}
