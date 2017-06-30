package codekamp.screens;

import codekamp.Game;
import codekamp.entities.Block;
import codekamp.entities.Player;
import codekamp.utils.RandomGen;
import codekamp.utils.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by cerebro on 29/06/17.
 */
public class Stage1Screen extends Screen {

    public List<Block> blocks = new ArrayList<>();
    public Player player;

    public static final Color SKY_BLUE_COLOR = new Color(146, 212, 255);
    public static final int GRASS_HEIGHT = 45;
    public static final int GRASS_Y = Game.HEIGHT - GRASS_HEIGHT;

    public static final int PLAYER_HEIGHT = 90;
    public static final int PLAYER_GROUND_Y = GRASS_Y - PLAYER_HEIGHT;
    public static final int PLAYER_START_X = 400;

    public static final int BLOCK_HEIGHT = 50;
    public static final int BLOCK_GROUND_Y = GRASS_Y - BLOCK_HEIGHT;
    public static final int BLOCK_AIR_Y = GRASS_Y - BLOCK_HEIGHT - 80;
    public static final int BLOCK_GAP = 200;
    public static final int BLOCK_START = 980;

    public Stage1Screen() {
        blocks.add(new Block(BLOCK_START, getRandomBlockY()));
        blocks.add(new Block(BLOCK_START + BLOCK_GAP, getRandomBlockY()));
        blocks.add(new Block(BLOCK_START + 2 * BLOCK_GAP, getRandomBlockY()));
        blocks.add(new Block(BLOCK_START + 3 * BLOCK_GAP, getRandomBlockY()));
        blocks.add(new Block(BLOCK_START + 4 * BLOCK_GAP, getRandomBlockY()));

        player = new Player(PLAYER_START_X, PLAYER_GROUND_Y);

        entities.addAll(blocks);
        entities.add(player);

    }

    @Override
    public void update() {
        super.update();

        for (Block b: blocks) {
            if(b.x <= 0) {
                b.xVel = 5;
            } else if (b.x >= 800) {
                b.xVel = -5;
            }
        }

        if(player.y >= PLAYER_GROUND_Y) {
            player.y = PLAYER_GROUND_Y;
            player.inAir = false;
            player.yVel = 0;
            player.yAcc = 0;
        }
    }

    private int getRandomBlockY() {
        if(RandomGen.get(2) == 0) {
            return BLOCK_GROUND_Y;
        } else {
            return BLOCK_AIR_Y;
        }
    }



    @Override
    public void render(Graphics g) {
        super.render(g);

        g.setColor(SKY_BLUE_COLOR);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);

        g.drawImage(Resources.grassImage, 0, GRASS_Y, null);

        super.render(g);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(player.y == PLAYER_GROUND_Y && keyCode == KeyEvent.VK_SPACE) {
            player.yVel = -20;
            player.yAcc = 1;
            Resources.jumpAudio.play();
            player.inAir = true;
        }
    }
}
