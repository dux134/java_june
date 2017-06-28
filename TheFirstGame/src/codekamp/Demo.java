package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.LinkedList;

import java.util.List;
import java.util.Random;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {


    public static int playerYCord = 315;
    public static int playerYVel = 0;
    public static int playerYAcc = 0;
    public static int ducked = 0;

    public static AudioClip jumpAudio;


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
        URL blockImageUrl = Demo.class.getResource("resources/block.png");
        URL playerImageUrl1 = Demo.class.getResource("resources/run_anim1.png");
        URL playerImageUrl2 = Demo.class.getResource("resources/run_anim2.png");
        URL playerImageUrl3 = Demo.class.getResource("resources/run_anim3.png");
        URL playerImageUrl4 = Demo.class.getResource("resources/run_anim4.png");
        URL playerImageUrl5 = Demo.class.getResource("resources/run_anim5.png");
        URL jumpImageUrl = Demo.class.getResource("resources/jump.png");
        URL duckImageUrl = Demo.class.getResource("resources/duck.png");
        URL jumpAudioUrl = Demo.class.getResource("resources/onjump.wav");
        URL hitAudioUrl = Demo.class.getResource("resources/hit.wav");

        Image grassImage = null;
        Image blockImage = null;
        Image playerImage1 = null;
        Image playerImage2 = null;
        Image playerImage3 = null;
        Image playerImage4 = null;
        Image playerImage5 = null;
        Image jumpImage = null;
        Image duckImage = null;
        Image playerCurrentImage = null;

        Demo.jumpAudio = Applet.newAudioClip(jumpAudioUrl);
        AudioClip hitAudio = Applet.newAudioClip(hitAudioUrl);


        List<Image> playerImages = new LinkedList<>();

        try {
            grassImage = ImageIO.read(grassImageUrl);
            blockImage = ImageIO.read(blockImageUrl);
            playerImage1 = ImageIO.read(playerImageUrl1);
            playerImage2 = ImageIO.read(playerImageUrl2);
            playerImage3 = ImageIO.read(playerImageUrl3);
            playerImage4 = ImageIO.read(playerImageUrl4);
            playerImage5 = ImageIO.read(playerImageUrl5);
            jumpImage = ImageIO.read(jumpImageUrl);
            duckImage = ImageIO.read(duckImageUrl);
        } catch (Exception e) {
            Graphics g = p.getGraphics();
            g.setColor(Color.red);
            g.drawString("Game seems to be corrupted. Please uninstall and then try installing again", 10, 225);
            g.dispose();
            return;
        }

        playerImages.add(playerImage1);
        playerImages.add(playerImage2);
        playerImages.add(playerImage3);
        playerImages.add(playerImage4);
        playerImages.add(playerImage5);
        playerImages.add(playerImage4);
        playerImages.add(playerImage3);
        playerImages.add(playerImage2);

        int index = 0;

        int block1X = 900;
        int block1Y = 355;
        boolean block1Visible = true;
        int playerXCord = 400;

        Random r1 = new Random();

        Rectangle playerRect = new Rectangle();
        Rectangle block1Rect = new Rectangle(20, 50);

        int score = 0;
        int counter = 0;

        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                continue;
            }

            index++;
            index = index % 8;

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord += Demo.playerYVel;

            block1X -= 5;

            if(block1X <= -20) {
                block1X = 900;

                block1Visible = true;

                if(r1.nextInt(2) == 0) {
                    block1Y = 355;
                } else {
                    block1Y = 275;
                }
            }

            if(Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYAcc = 0;
                Demo.playerYVel = 0;
            }

            playerCurrentImage = playerImages.get(index);

            if(Demo.playerYCord < 315) {
                playerCurrentImage = jumpImage;
            }


            block1Rect.setLocation(block1X, block1Y);

            if(Demo.ducked > 0) {
                playerCurrentImage = duckImage;

                playerRect.setBounds(playerXCord, Demo.playerYCord + 20, 72, 70);
                Demo.ducked--;
            } else {
                playerRect.setBounds(playerXCord, Demo.playerYCord, 72, 90);
            }

            if(block1Visible && playerRect.intersects(block1Rect)) {
                playerXCord -= 100;
                block1Visible = false;

                hitAudio.play();
            }


            Graphics g1 = p.getGraphics();


            if(playerXCord < 0) {
                g1.setColor(Color.red);
                g1.fillRect(0, 0, 800, 450);
                g1.setColor(Color.green);
                g1.drawString("Game Over", 100, 100);
                g1.drawString("Your score was " + score, 100, 300);
            } else {

                counter++;

                if(counter > 20) {
                    counter = 0;
                    score++;
                }

                g1.setColor(skyBlue);
                g1.fillRect(0, 0, 800, 450);
                g1.drawImage(grassImage, 0, 405, null);
                g1.drawImage(playerCurrentImage, playerXCord, Demo.playerYCord, null);

                if (block1Visible) {
                    g1.drawImage(blockImage, block1X, block1Y, null);
                }

                g1.setColor(Color.red);
                g1.drawString("score is " + score, 10, 20);
            }

            g1.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(Demo.playerYCord == 315 && e.getKeyCode() == KeyEvent.VK_SPACE) {
            Demo.playerYVel = -20;
            Demo.playerYAcc = 1;
            Demo.jumpAudio.play();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && Demo.ducked == 0) {
            Demo.ducked = 20;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
