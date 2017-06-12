package codekamp;

/**
 * Created by cerebro on 08/06/17.
 */
public class Dog extends Animal {
    public String name;
    public String breed;

    public void introduceYourself() {
        System.out.println("My name is " + this.name);
    }

    public void bark() {
        System.out.println("I am " + this.name + " and I am barking");
    }

    public static void talk() {
        System.out.println("wuff wuff");
    }
}
