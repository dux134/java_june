package codekamp.entities;

import codekamp.utils.RandomGenerator;
import codekamp.utils.Resources;

import java.awt.*;

/**
 * Created by cerebro on 28/06/17.
 */
public class Cloud extends Entity {

    public Cloud(int x) {

        super(128, 71);

        this.x = x;

        this.setRandomY();
        this.xVel = -2;
    }

    @Override
    public void update() {
        super.update();

        if(this.x < -128) {
            this.x = 900;
            this.setRandomY();
        }
    }

    public void setRandomY() {
        this.y = RandomGenerator.randomInt(50, 150);
    }

    @Override
    public Image getImage() {
        return Resources.cloudImage;
    }
}
