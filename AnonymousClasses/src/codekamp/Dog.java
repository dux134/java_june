package codekamp;

/**
 * Created by cerebro on 04/07/17.
 */
public class Dog {

    public String name;

    public void something() {

        Cat c1 = new Cat() {
            @Override
            public void xyz() {
                System.out.println("I love Java.");
                this.talk();
                Dog.this.talk();
            }
        };

        c1.xyz();
    }

    public void talk() {
        System.out.println("Wuff Wuff " + this.name);
    }

    public void walk() {
        System.out.println("Move Move Move");
    }

    public class Toy {

        public String title;

        public void play() {
            System.out.println(Dog.this.name + " playing with " + this.title);
        }
    }
}
