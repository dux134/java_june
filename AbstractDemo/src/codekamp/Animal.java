package codekamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 29/06/17.
 */
abstract public class Animal implements ActionListener {

    // 1. we can't instantiate Abstract classes
    // 2. Abstract classes can have both normal and abstract methods
    public void walk() {
        System.out.println("move move move");
    }

    abstract public void talk();
}
