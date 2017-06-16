package codekamp;

/**
 * Created by cerebro on 16/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        CodeKampFrame frame1 = new CodeKampFrame();
        CodeKampFrame frame2 = new CodeKampFrame();

        frame1.sibling = frame2;
        frame2.sibling = frame1;
    }
}
