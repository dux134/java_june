package codekamp;

/**
 * Created by cerebro on 14/06/17.
 */
public class Demo {

    // constructors Characterstics:

    // 1. Function which same name as class name
    // 2. No return type
    // 3. Always non static
    // 4. Only parameter less constructor is inherited. And that too only...
    // ... when child class has no constructor of it's own.
    // 5. first line in every constructor should be a call to parent constructor,
    // directly or indirectly.

    public static void main(String[] args) {
        Cat c1 = new Cat("Venus"); // we are searching for a paramterless constructor

        c1.walk();
        c1.walk();
        c1.walk();
        c1.walk();
        c1.walk();
        c1.Cat("VEnus");
    }
}
