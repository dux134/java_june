package codekamp.states;

import codekamp.utils.RandomGenerator;

import java.awt.*;

/**
 * Created by cerebro on 27/06/17.
 */
public class Stage2State extends State {

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics a) {
        a.fillOval(RandomGenerator.randomInt(700), RandomGenerator.randomInt(350), 100, 100);
    }
}
