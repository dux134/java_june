package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {

    public static int xVel = 3;
    public static int yVel = 3;

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

        p.setFocusable(true);
        p.requestFocus();

        Demo d1 = new Demo();
        p.addKeyListener(d1);

        int x = 0;
        int y = 0;



        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x += Demo.xVel;
            y += Demo.yVel;


            if(y >= 300) {
                y = 300;
                Demo.yVel = -3;
            }

            if(x >= 400) {
                x = 400;
                Demo.xVel = -3;
            }

            if(y <= 0) {
                y = 0;
                Demo.yVel = 3;
            }

            if(x <= 0) {
                x = 0;
                Demo.xVel = 3;
            }

            Graphics g1 = p.getGraphics();
            g1.clearRect(0, 0, 500, 400);
            g1.setColor(Color.cyan);
            g1.fillRect(0, 0, 500, 400);
            g1.setColor(Color.yellow);
            g1.fillOval(x, y, 100, 100);
            g1.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                Demo.xVel = 3;
                Demo.yVel = 0;
                break;
            case KeyEvent.VK_LEFT:
                Demo.xVel = -3;
                Demo.yVel = 0;
                break;
            case KeyEvent.VK_UP:
                Demo.xVel = 0;
                Demo.yVel = -3;
                break;
            case KeyEvent.VK_DOWN:
                Demo.xVel = 0;
                Demo.yVel = 3;
                break;
            default:
                System.out.println("some other key pressed");

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
}
