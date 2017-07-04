package codekamp.screens;

import codekamp.entities.Entity;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 29/06/17.
 */
abstract public class Screen {

    public List<Entity> entities = new ArrayList<>();

    public void update() {
        for(Entity e: entities) {
            e.update();
        }
    }

    public void render(Graphics g) {
        for(Entity e: entities) {
            if(e.visible) {
                g.drawImage(e.getImage(), e.x, e.y, null);
            }
        }
    }

    public void onKeyPress(int keyCode) {

    }

    public void onKeyRelease(int keyCode) {

    }

    public void onclick(int x, int y) {

    }
}
