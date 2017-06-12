package codekamp.abc;

import codekamp.Animal;
import codekamp.Demo;

public class Dog extends Animal {

    public String name;

    public void introduceYourself() {
        System.out.println("My name is " + this.name + " and I am a dog");
    }

    public void doSomething() {
        System.out.println("Chasing the tail");
    }

    public static void bark() {
        System.out.println("wuff wuff");
    }
}
