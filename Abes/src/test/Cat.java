package test;

/**
 * Created by cerebro on 06/06/17.
 */
public class Cat {

    public static int averageAge = 5;

    public int age = 10;
    public String name;
    public static String scientificName;

    public static void talk() {

        System.out.println("meow meow");
    }

    public void introduceYourself() {

        System.out.println("Hi, my name is " + this.name + " and I am a cat");
    }

    public void dance() {
        System.out.println(this.name + " is dancing");
    }

    public boolean isOlderThan(Cat c) {
        if(this.age > c.age) {
            return true;
        } else {
            return false;
        }
    }
}
