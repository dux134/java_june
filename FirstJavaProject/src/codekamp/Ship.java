package codekamp;

/**
 * Created by cerebro on 05/06/17.
 */
public class Ship {

    public static void fire(int x, int y, String bombName) {
        System.out.println("fire!!!");

        Ship.decreaseBombCount(bombName);
    }


    public static void move(int x, int y) {
        System.out.println("move move move");

        Ship.decreaseFuel(10);
    }

    private static void decreaseFuel(int kmsMoved) {
        System.out.println("fuel decreased");
    }

    private static void decreaseBombCount(String bombName) {
        System.out.println("bomb count decreased");
    }

//    coursetro.com
}
