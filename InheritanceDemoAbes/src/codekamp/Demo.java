package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 08/06/17.
 */
public class Demo {

    public static Dog d2;
    public static Dog d3;

    public static void main(String[] args) {

        Dog d1 = new Dog(); //memory #1
        d1.name = "Saturn";


        Demo.someRandomFunction(d1);

        Demo.d2 = new Dog(); //memory #2
        Demo.d2.name = "Mars";


    }

    public static void someRandomFunction(Dog d) {
        Demo.d3 = d;
    }
}
