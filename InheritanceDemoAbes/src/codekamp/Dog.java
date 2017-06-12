package codekamp;

/**
 * Created by cerebro on 08/06/17.
 */
public class Dog extends Animal {

    public String name;
    public String breed;

    public static int averageAge;

    public int age;

    public void bark() {
        System.out.println(this.name + " is barking");
    }

    public void introduceYourself() {
        System.out.println("Hi, My name is " + this.name + " and I am dog");
    }

    public void doThing() {
        System.out.println("Do some dog thing");
    }

    public void dance() {
        System.out.println("dancing dog!!!");
    }
}
