package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        JPanel p = new JPanel();

        Dimension d = new Dimension(800, 450);
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

        Color skyBlue = new Color(208, 244, 247);

        URL grassImageUrl = Demo.class.getResource("resources/grass.png");
        URL playerImageUrl1 = Demo.class.getResource("resources/run_anim1.png");
        URL playerImageUrl2 = Demo.class.getResource("resources/run_anim2.png");
        URL playerImageUrl3 = Demo.class.getResource("resources/run_anim3.png");
        URL playerImageUrl4 = Demo.class.getResource("resources/run_anim4.png");
        URL playerImageUrl5 = Demo.class.getResource("resources/run_anim5.png");

        Image grassImage;
        Image playerImage1;
        Image playerImage2;
        Image playerImage3;
        Image playerImage4;
        Image playerImage5;

        try {
            grassImage = ImageIO.read(grassImageUrl);
            playerImage1 = ImageIO.read(playerImageUrl1);
            playerImage2 = ImageIO.read(playerImageUrl2);
            playerImage3 = ImageIO.read(playerImageUrl3);
            playerImage4 = ImageIO.read(playerImageUrl4);
            playerImage5 = ImageIO.read(playerImageUrl5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image[] playerImages = {
                playerImage1,
                playerImage2,
                playerImage3,
                playerImage4,
                playerImage5,
                playerImage4,
                playerImage3,
                playerImage2,
        };

        int currentIndex = 0;

        while (true) {

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentIndex++;

            currentIndex = currentIndex % 8;

            Graphics g = p.getGraphics();
            g.clearRect(0, 0, 800, 450);

            g.setColor(skyBlue);
            g.fillRect(0,0,800,450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImages[currentIndex], 350, 315, null);


            g.dispose();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Demo.class.isAssignableFrom(JPanel.class);

        Demo d1 = new Demo();
        JPanel p = new JPanel();
        Demo.class.isInstance(p);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //do nothing
    }
}
