package codekamp.entities;

import codekamp.utils.RandomGenerator;
import codekamp.utils.Resources;

import java.awt.*;

/**
 * Created by cerebro on 28/06/17.
 */
public class Block extends Entity {

    private static final int GROUND_Y = 355;
    private static final int AIR_Y = 275;

    public Block(int x) {
        this.x = x;
        this.setRandomY();
        this.xVel = -5;
    }

    @Override
    public void update() {
        super.update();

        if (this.x < -20) {
            this.x = 980;
            this.setRandomY();
        }
    }

    private void setRandomY() {
        if (RandomGenerator.randomInt(2) == 0) {
            this.y = GROUND_Y;
        } else {
            this.y = AIR_Y;
        }
    }

    @Override
    public Image getImage() {
        return Resources.blockImage;
    }
}
