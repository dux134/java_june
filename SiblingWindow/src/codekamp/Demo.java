package codekamp;

public class Demo {

    public static void main(String[] args) {
        CodeKampJFrame frame1 = new CodeKampJFrame("my window 1");
        CodeKampJFrame frame2 = new CodeKampJFrame("my window 2");


        frame1.setSiblingWindow(frame2);

        frame1.setVisible(true);
        frame2.setVisible(true);


    }
}
