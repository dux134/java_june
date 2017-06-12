package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 08/06/17.
 */
public class Demo {

    public static Animal currentAnimal;
    public static void main(String[] args) {


        // Inside a variable of some XYZ class we can store objects of XYZ class
        // and it's subclasses

        // whether the function call is allowed or not is decided by
        // datatype of variable, not of Object. This check happens at compile time

        // complile time pe function search karenge variable ki class mein




        // but when program actually runs, function search starts from datatype
        // of Object, not of variable. This check happens at runtime

        // run time pe function search karenge object ki class mein

        Random r1 = new Random();

        int x = r1.nextInt(2);


        if(x == 0) {
            //show dog on screen

            Demo.currentAnimal = new Dog();
        } else {
            //show cat on screen

            Demo.currentAnimal = new Cat();
        }

        Demo.currentAnimal.doThing();
    }
}
