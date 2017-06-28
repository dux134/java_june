package codekamp.states;

import codekamp.Game;
import codekamp.entities.Block;
import codekamp.entities.Cloud;
import codekamp.entities.Entity;
import codekamp.entities.Player;
import codekamp.utils.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 27/06/17.
 */
public class Stage1State extends State {

    private static final int GRASS_HEIGHT = 45;
    private static final int GRASS_Y_CORD = Game.HEIGHT - GRASS_HEIGHT;
    private static final Color SKY_BLUE_COLOR = new Color(161, 204, 255);
    private Player player;

    public Stage1State() {

        player = new Player();

        entities.add(new Block(900));
        entities.add(new Block(1100));
        entities.add(new Block(1300));
        entities.add(new Block(1500));
        entities.add(new Block(1700));
        entities.add(new Cloud(600));
        entities.add(new Cloud(900));
        entities.add(player);
    }

    @Override
    public void render(Graphics a) {
        a.setColor(SKY_BLUE_COLOR);
        a.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        a.drawImage(Resources.grassImage, 0, GRASS_Y_CORD, null);

        for (Entity e:entities) {
            a.drawImage(e.getImage(), e.x, e.y, null);
        }
    }

    @Override
    public void onKeyDown(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            player.jump();
        } else if (keyCode == KeyEvent.VK_DOWN) {
            player.duck();
        }
    }
}
