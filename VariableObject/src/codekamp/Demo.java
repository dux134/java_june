package codekamp;

/**
 * Created by cerebro on 13/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        Dog d1 = new Dog(); //Dog #1
        d1.name = "Jupiter";

        Dog d2 = d1;

        System.out.println(d1.name);
        System.out.println(d2.name);

        d2.name = "Mars";

        Dog d3 = new Dog(); //Dog #2
        d3.name = "Saturn";

        d3 = d2;




        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d3.name);
    }
}
