package codekamp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 29/06/17.
 */
public class Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new GamePanel();

        frame.add(p);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
