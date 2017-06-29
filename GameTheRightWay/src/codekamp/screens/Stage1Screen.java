package codekamp.screens;

import codekamp.Game;

import java.awt.*;

/**
 * Created by cerebro on 29/06/17.
 */
public class Stage1Screen extends Screen {

    @Override
    public void render(Graphics g) {
        super.render(g);

        g.setColor(Color.green);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

        g.setFont(new Font("Aerial", Font.BOLD, 50));
        g.setColor(Color.yellow);
        g.drawString("this is stage 1", 10, 100);
    }
}
