package codekamp;

/**
 * Created by cerebro on 14/06/17.
 */
public class Demo {

    // 1. non static
    // 2. same name as class name
    // 3. no return type
    // 4. it's a function which gets called
    // when a new object of class is created
    // 5. Only paratmeterless (default) constructor
    // can be inherited.
    // 6. Even paramterless constructor gets inherited
    // when child class has no constructor of it's own
    // 7. First line in every constructor should be a call to parent
    // class constructor, directly or indirectly.

    public static void main(String[] args) {

        Cat c1 = new Cat("venus"); // searching for a parameterless constructor
    }
}
