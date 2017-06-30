package codekamp.screens;

import codekamp.Game;
import codekamp.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 29/06/17.
 */
public class WelcomeScreen extends Screen {

    @Override
    public void render(Graphics g) {

        g.setColor(Color.cyan);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.setColor(Color.red);
        g.setFont(new Font("Aerial", Font.BOLD, 24));
        g.drawString("Welcome to Jumper", 10, 50);
        g.drawString("Press enter to play", 10, 150);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_ENTER) {
            GamePanel.currentScreen = new Stage1Screen();
        }
    }
}
