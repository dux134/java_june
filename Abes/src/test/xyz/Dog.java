package test.xyz;

/**
 * Created by cerebro on 06/06/17.
 */
public class Dog {

    public static int averageAge = 10;

    public int age;
    public String name;

    public static void talk() {

        System.out.println(Dog.averageAge);

        System.out.println("wuff wuff");
    }

    public void introduceYourself() {
        System.out.println("Hi, I am a dog and my name is " + this.name);
    }
}
