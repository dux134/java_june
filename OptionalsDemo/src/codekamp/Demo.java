package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 05/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bill Clinton");

                Random r = new Random();
        int randomInt = r.nextInt(2);

        if(randomInt == 0) {
            dog1.breed = "Pitbull";

            int i;
        }

        int xyz = 0;

        System.out.println(dog1.breed.length());
        System.out.println(dog1.name.length());
    }
}
