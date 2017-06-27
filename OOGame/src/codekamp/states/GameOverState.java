package codekamp.states;

import codekamp.Game;

import java.awt.*;

/**
 * Created by cerebro on 27/06/17.
 */
public class GameOverState extends State {

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics a) {
        a.setColor(Color.cyan);
        a.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

        a.setColor(Color.red);
        a.drawString("Game OVER", 200, 200);
    }
}
