package codekamp.entities;

import java.awt.*;

/**
 * Created by cerebro on 28/06/17.
 */
abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;

    abstract public Image getImage();

    public void update() {
        x += xVel;
        y += yVel;
        xVel += xAcc;
        yVel += yAcc;
    }
}
