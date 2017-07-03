package codekamp.entities;

import codekamp.utils.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by cerebro on 30/06/17.
 */
public class Player extends Entity {

    public int ducked = 0;
    public boolean inAir = false;
    public int currentIndex = 0;
    public List<Image> images;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;

        this.images = new ArrayList<>();

        this.images.add(Resources.playerImage1);
        this.images.add(Resources.playerImage2);
        this.images.add(Resources.playerImage3);
        this.images.add(Resources.playerImage4);
        this.images.add(Resources.playerImage5);
        this.images.add(Resources.playerImage4);
        this.images.add(Resources.playerImage3);
        this.images.add(Resources.playerImage2);
    }

    @Override
    public void update() {
        super.update();

        currentIndex++;
        currentIndex %= 8;

        if (ducked > 0) {
            ducked--;
        }
    }

    @Override
    public Image getImage() {
        if (inAir) {
            return Resources.playerJumpImage;
        } else if (ducked > 0) {
            return Resources.playerDuckImage;
        } else {
            return this.images.get(currentIndex);
        }
    }

    @Override
    public int getWidth() {
        return 72;
    }

    @Override
    public int getHeight() {
        if (ducked > 0) {
            return 70;
        }

        return 90;
    }

    public void duck() {
        if (ducked == 0) {
            ducked = 20;
        }
    }
}
