package codekamp.entities;

import java.awt.*;

/**
 * Created by cerebro on 30/06/17.
 */
abstract public class Entity {

    public int x;
    public int y;
    public int xVel;
    public int yVel;
    public int xAcc;
    public int yAcc;

    public void update() {
        x += xVel;
        y += yVel;
        xVel += xAcc;
        yVel += yAcc;
    }

    abstract public Image getImage();
}
