package codekamp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 29/06/17.
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.walk();

        a.talk();
    }
}
