package codekamp.states;

import codekamp.Game;
import codekamp.entities.Block;
import codekamp.entities.Cloud;
import codekamp.entities.Entity;
import codekamp.entities.Player;
import codekamp.utils.RandomGenerator;
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
    private static final int GROUND_Y = 355;
    private static final int AIR_Y = 275;
    private Player player;

    private List<Block> blocks = new ArrayList<>();

    public Stage1State() {

        player = new Player();

        blocks.add(new Block(900, getRandomBlockY()));
        blocks.add(new Block(1100, getRandomBlockY()));
        blocks.add(new Block(1300, getRandomBlockY()));
        blocks.add(new Block(1500, getRandomBlockY()));
        blocks.add(new Block(1700, getRandomBlockY()));

        entities.addAll(blocks);
        entities.add(new Cloud(600));
        entities.add(new Cloud(900));
        entities.add(player);
    }

    private int getRandomBlockY() {
        if (RandomGenerator.randomInt(2) == 0) {
            return GROUND_Y;
        } else {
            return AIR_Y;
        }
    }

    @Override
    public void update() {
        super.update();


        for (Block b : blocks) {
            if (player.isCollidingWith(b)) {
                player.x -= 50;
                Resources.hitAudio.play();
                b.visible = false;
            }

            if (b.x < -20) {
                b.x = 980;
                b.visible = true;

                b.y = getRandomBlockY();
            }
        }
    }

    @Override
    public void render(Graphics a) {
        a.setColor(SKY_BLUE_COLOR);
        a.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        a.drawImage(Resources.grassImage, 0, GRASS_Y_CORD, null);

        for (Entity e : entities) {
            if (e.visible) {
                a.drawImage(e.getImage(), e.x, e.y, null);
            }
        }
    }

    @Override
    public void onKeyDown(int keyCode) {
        if (keyCode == KeyEvent.VK_SPACE) {
            player.jump();
        } else if (keyCode == KeyEvent.VK_DOWN) {
            player.duck();
        }
    }
}
