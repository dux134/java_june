package codekamp;

/**
 * Created by cerebro on 16/06/17.
 */

abstract public class Animal {

    public void walk() {
        System.out.println("Animal is walking...");
    }

    public void jump() {
        System.out.println("Animal is jumping...");
    }

    abstract public void talk();

}
