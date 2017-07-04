package codekamp.utils;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;

/**
 * Created by cerebro on 30/06/17.
 */
public class Resources {

    public static Image grassImage;
    public static Image playerImage1;
    public static Image playerImage2;
    public static Image playerImage3;
    public static Image playerImage4;
    public static Image playerImage5;
    public static Image playerDuckImage;
    public static Image playerJumpImage;
    public static Image blockImage;
    public static Image cloudImage;

    public static AudioClip jumpAudio;
    public static AudioClip hitAudio;


    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getResource("../resources/grass.png"));
            Resources.grassImage = ImageIO.read(Resources.class.getResource("../resources/grass.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getResource("../resources/block.png"));
            Resources.cloudImage = ImageIO.read(Resources.class.getResource("../resources/cloud1.png"));
            Resources.playerImage1 = ImageIO.read(Resources.class.getResource("../resources/run_anim1.png"));
            Resources.playerImage2 = ImageIO.read(Resources.class.getResource("../resources/run_anim2.png"));
            Resources.playerImage3 = ImageIO.read(Resources.class.getResource("../resources/run_anim3.png"));
            Resources.playerImage4 = ImageIO.read(Resources.class.getResource("../resources/run_anim4.png"));
            Resources.playerImage5 = ImageIO.read(Resources.class.getResource("../resources/run_anim5.png"));
            Resources.playerJumpImage = ImageIO.read(Resources.class.getResource("../resources/jump.png"));
            Resources.playerDuckImage = ImageIO.read(Resources.class.getResource("../resources/duck.png"));
            Resources.jumpAudio = Applet.newAudioClip(Resources.class.getResource("../resources/onjump.wav"));
            Resources.hitAudio = Applet.newAudioClip(Resources.class.getResource("../resources/hit.wav"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
