package codekamp;

import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static int ducked = 0;
    private static AudioClip jumpAudio;


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
        Color scoreColor = new Color(255, 251, 19);

        URL grassImageUrl = Demo.class.getResource("resources/grass.png");
        URL playerImageUrl1 = Demo.class.getResource("resources/run_anim1.png");
        URL playerImageUrl2 = Demo.class.getResource("resources/run_anim2.png");
        URL playerImageUrl3 = Demo.class.getResource("resources/run_anim3.png");
        URL playerImageUrl4 = Demo.class.getResource("resources/run_anim4.png");
        URL playerImageUrl5 = Demo.class.getResource("resources/run_anim5.png");
        URL playerJumpImageUrl = Demo.class.getResource("resources/jump.png");
        URL playerDuckImageUrl = Demo.class.getResource("resources/duck.png");
        URL blockImageUrl = Demo.class.getResource("resources/block.png");
        URL jumpAudioUrl = Demo.class.getResource("resources/onjump.wav");
        URL hitAudioUrl = Demo.class.getResource("resources/hit.wav");

        Image grassImage = null;
        Image playerImage1 = null;
        Image playerImage2 = null;
        Image playerImage3 = null;
        Image playerImage4 = null;
        Image playerImage5 = null;
        Image playerJumpImage = null;
        Image playerDuckImage = null;
        Image currentPlayerImage = null;
        Image blockImage = null;
        AudioClip hitAudio = null;

        try {
            grassImage = ImageIO.read(grassImageUrl);
            playerImage1 = ImageIO.read(playerImageUrl1);
            playerImage2 = ImageIO.read(playerImageUrl2);
            playerImage3 = ImageIO.read(playerImageUrl3);
            playerImage4 = ImageIO.read(playerImageUrl4);
            playerImage5 = ImageIO.read(playerImageUrl5);
            playerJumpImage = ImageIO.read(playerJumpImageUrl);
            playerDuckImage = ImageIO.read(playerDuckImageUrl);
            blockImage = ImageIO.read(blockImageUrl);
            Demo.jumpAudio = Applet.newAudioClip(jumpAudioUrl);
            hitAudio = Applet.newAudioClip(hitAudioUrl);
        } catch (IOException e) {
            System.out.println("unable to load images");
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


        int playerXCord = 350;
        int block1X = 900;
        int block2X = 1100;

        int block1Y = 355;
        int block2Y = 355;

        boolean block1Visible = true;
        boolean block2Visible = true;

        Random r1 = new Random();

        Rectangle playerRect = new Rectangle(72, 90);
        Rectangle block1Rect = new Rectangle(20, 50);
        Rectangle block2Rect = new Rectangle(20, 50);


        int score = 0;

        while (true) {

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentIndex++;

            currentIndex = currentIndex % 8;

            currentPlayerImage = playerImages[currentIndex];

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord += Demo.playerYVel;

            if(Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYAcc = 0;
                Demo.playerYVel = 0;
            }


            block1X -= 5;
            block2X -= 5;

            if(block1X <= -20) {
                block1X = 900;

                if(block1Visible) {
                    score++;
                }

                block1Visible = true;

                if(r1.nextInt(2) == 0) {
                    block1Y = 355;
                } else {
                    block1Y = 275;
                }
            }

            if(block2X <= -20) {
                block2X = 900;

                if(block2Visible) {
                    score++;
                }

                block2Visible = true;

                if(r1.nextInt(2) == 0) {
                    block2Y = 355;
                } else {
                    block2Y = 275;
                }
            }


            playerRect.setBounds(playerXCord, Demo.playerYCord, 72, 90);
            block1Rect.setLocation(block1X, block1Y);
            block2Rect.setLocation(block2X, block2Y);
            
            if(Demo.ducked > 0) {
                Demo.ducked--;
                currentPlayerImage = playerDuckImage;
                playerRect.setBounds(playerXCord, Demo.playerYCord + 20, 72, 70);
            }


            if(block1Visible && playerRect.intersects(block1Rect)) {
                playerXCord -= 50;
                block1Visible = false;
                hitAudio.play();
            }

            if(block2Visible && playerRect.intersects(block2Rect)) {
                playerXCord -= 50;
                block2Visible = false;
                hitAudio.play();
            }

            if(Demo.playerYCord < 315) {
                currentPlayerImage = playerJumpImage;
            }

            Graphics g = p.getGraphics();
            g.clearRect(0, 0, 800, 450);

            g.setColor(skyBlue);
            g.fillRect(0,0,800,450);

            if(playerXCord < 0) {
                g.setColor(Color.red);
                g.drawString("Game Over", 100, 100);
                g.drawString("Your Score Was " + score, 300, 300);
                g.dispose();
                return;
            }

            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(currentPlayerImage, playerXCord, Demo.playerYCord, null);

            g.setColor(Color.red);
            g.drawString("Score: " + score, 700, 20);

            if(block1Visible) {
                g.drawImage(blockImage, block1X, block1Y, null);
            }

            if(block2Visible) {
                g.drawImage(blockImage, block2X, block2Y, null);
            }


            g.dispose();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -20;
            Demo.playerYAcc = 1;
            Demo.jumpAudio.play();
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.ducked = 30;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //do nothing
    }
}
