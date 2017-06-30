package codekamp.utils;

import java.util.Random;

/**
 * Created by cerebro on 30/06/17.
 */
public class RandomGen {
    private static Random r = new Random();

    public static int get(int upperLimit) {
        return r.nextInt(upperLimit);
    }

    public static int get(int lowerLimt, int upperLimit) {
        int x = r.nextInt(upperLimit - lowerLimt);

        return x + lowerLimt;
    }
}
