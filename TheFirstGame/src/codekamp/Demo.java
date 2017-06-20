package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        frame.add(p);

        Dimension d = new Dimension(800, 450);
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


        Color skyBlue = new Color(126, 209, 255);


        URL grassImageUrl = Demo.class.getResource("resources/grass.png");
        URL playerImageUrl = Demo.class.getResource("resources/run_anim1.png");

        Image grassImage = null;
        Image playerImage = null;

        try {
            grassImage = ImageIO.read(grassImageUrl);
            playerImage = ImageIO.read(playerImageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Graphics g1 = p.getGraphics();

            g1.setColor(skyBlue);
            g1.fillRect(0, 0, 800, 450);
            g1.drawImage(grassImage, 0, 405, null);
            g1.drawImage(playerImage, 400, 315, null);


            g1.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
}
