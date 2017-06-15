package codekamp;

/**
 * Created by cerebro on 14/06/17.
 */
public class Cat extends Animal {


    public Cat(int a) {
        super(a, 10);
        System.out.println("Cat class kaa int vala constructor");
    }

    public Cat(String a) {
        this(10);

        System.out.println("Cat class kaa String vala constructor");
    }

    public Cat(String a, String b) {
        this(b);
    }

    public void walk() {

    }

}
