package codekamp.states;

import java.awt.*;

/**
 * Created by cerebro on 27/06/17.
 */
abstract public class State {

    abstract public void update();
    abstract public void render(Graphics a);

    public void onKeyDown(int keyCode) {

    }

    public void onKeyUp(int keyCode) {

    }

    public void onClick(int x, int y) {

    }
}
