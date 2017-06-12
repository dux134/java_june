package test;

import test.xyz.Dog;

/**
 * Created by cerebro on 06/06/17.
 */
public class Cat {

    public static int averageAge = 5;

    public String name;
    public int age;

    public static void talk() {

        int energy = 99;

        System.out.println("Meow Meow");

        System.out.println(Cat.averageAge);
    }

    public static void walk() {
        Cat.talk();
        Dog.talk();
        System.out.println(Cat.averageAge);
        System.out.println("tak tak tak tak");
    }
}
