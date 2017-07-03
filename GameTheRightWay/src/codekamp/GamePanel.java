package codekamp;

import codekamp.screens.Screen;
import codekamp.screens.WelcomeScreen;
import codekamp.utils.Resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 29/06/17.
 */
public class GamePanel extends JPanel implements KeyListener, MouseListener, Runnable {

    public static Screen currentScreen;

    public GamePanel() {
        setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.requestFocus();
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

        currentScreen.onKeyRelease(e.getKeyCode());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        currentScreen.onclick(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }

            currentScreen.update();

            Graphics pg = this.getGraphics();

            currentScreen.render(pg);

            pg.dispose();

        }
    }
}
