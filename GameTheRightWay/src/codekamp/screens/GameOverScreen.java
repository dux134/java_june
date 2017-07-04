package codekamp.screens;

import codekamp.Game;
import codekamp.GamePanel;

import java.awt.*;

/**
 * Created by cerebro on 04/07/17.
 */
public class GameOverScreen extends Screen {

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.setColor(Color.green);
        g.drawString("Game over", 100, 100);
    }

    @Override
    public void onKeyPress(int keyCode) {
        GamePanel.currentScreen = new Stage1Screen();
    }
}
