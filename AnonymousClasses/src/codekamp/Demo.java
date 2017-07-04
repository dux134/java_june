package codekamp;

/**
 * Created by cerebro on 04/07/17.
 */
public class Demo {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        Dog d2 = new Dog(){
            @Override
            public void talk() {
                System.out.println("Meow Meow");
                super.talk();
            }
        };
        Dog d3 = new Dog(){};

        d2.talk();
        d2.walk();
    }
}
