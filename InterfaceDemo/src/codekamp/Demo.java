package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 12/06/17.
 */
public class Demo {

    public static void main(String[] args) {

        Random r  = new Random();

        int a = r.nextInt(2);


        Animal a1 = null;

        if(a == 0) {
            a1 = new Dog();
        } else {
            a1 = new Cat();
        }

        a1.talk();

    }
}
