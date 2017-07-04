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
    public Rectangle rect = new Rectangle();
    public boolean visible = true;

    public void update() {
        x += xVel;
        y += yVel;
        xVel += xAcc;
        yVel += yAcc;
    }

    abstract public Image getImage();
    abstract public int getWidth();
    abstract public int getHeight();

    public boolean isCollidingWith(Entity other) {
        this.updateRect();
        other.updateRect();

        return this.visible && other.visible && this.rect.intersects(other.rect);
    }

    public void updateRect() {
        rect.setBounds(x, y, getWidth(), getHeight());
    }
}
