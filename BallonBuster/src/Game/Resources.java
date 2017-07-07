package Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 05/07/16.
 */
public class Resources {

    public static Image ballonImage;
    public static Image bombImage;
    public static Image gameOverImage;
    public static AudioClip burstAudio;

    private Resources(){}

    public static void load() {
        try {
            Resources.ballonImage = ImageIO.read(Resources.class.getResource("images/ballon.png"));
            Resources.gameOverImage = ImageIO.read(Resources.class.getResource("images/boom.png"));
            Resources.bombImage = ImageIO.read(Resources.class.getResource("images/bomb.png"));
            Resources.burstAudio = Applet.newAudioClip(Resources.class.getResource("audios/hit.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
