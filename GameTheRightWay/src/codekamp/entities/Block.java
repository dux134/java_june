package codekamp.entities;

import codekamp.utils.Resources;

import java.awt.*;

/**
 * Created by cerebro on 30/06/17.
 */
public class Block extends Entity {

    public Block(int x, int y) {
        this.x = x;
        this.y = y;

        this.xVel = -5;
    }

    @Override
    public Image getImage() {
        return Resources.blockImage;
    }

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 50;
    }
}
